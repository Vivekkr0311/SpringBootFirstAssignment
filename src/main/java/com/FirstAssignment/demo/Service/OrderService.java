package com.FirstAssignment.demo.Service;

import com.FirstAssignment.demo.Repository.CommerceItemRepository;
import com.FirstAssignment.demo.Repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    private OrderRepository orderRepository;
    private CommerceItemRepository commerceItemRepository;

    @Autowired
    public OrderService(OrderRepository orderRepository, CommerceItemRepository commerceItemRepository){
        this.orderRepository = orderRepository;
        this.commerceItemRepository = commerceItemRepository;
    }


}
