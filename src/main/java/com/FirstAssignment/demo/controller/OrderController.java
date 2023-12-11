package com.FirstAssignment.demo.controller;

import com.FirstAssignment.demo.Entity.CommerceItem;
import com.FirstAssignment.demo.Entity.Order;
import com.FirstAssignment.demo.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService){
        this.orderService = orderService;
    }

    @PostMapping
    public ResponseEntity<Order> createOrder(@RequestParam Order order, @RequestBody List<CommerceItem> commerceItems){
        Order createdOrder = orderService.createOrder(order, commerceItems);
        return new ResponseEntity<>(createdOrder, HttpStatus.CREATED);
    }
}
