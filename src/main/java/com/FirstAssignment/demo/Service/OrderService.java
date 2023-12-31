package com.FirstAssignment.demo.Service;

import com.FirstAssignment.demo.Entity.CommerceItem;
import com.FirstAssignment.demo.Entity.Order;
import com.FirstAssignment.demo.Repository.CommerceItemRepository;
import com.FirstAssignment.demo.Repository.OrderRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class OrderService {
    private OrderRepository orderRepository;
    private CommerceItemRepository commerceItemRepository;

    @Autowired
    public OrderService(OrderRepository orderRepository, CommerceItemRepository commerceItemRepository){
        this.orderRepository = orderRepository;
        this.commerceItemRepository = commerceItemRepository;
    }

    @Transactional
    public Order createOrder(Order order, List<CommerceItem> commerceItemList){
        order.setCreationDateTime(LocalDateTime.now());

        Order savedOrder = orderRepository.save(order);

        for (CommerceItem commerceItem : commerceItemList) {
            commerceItem.setOrder(savedOrder);
            commerceItemRepository.save(commerceItem);
        }

        return savedOrder;
    }
}
