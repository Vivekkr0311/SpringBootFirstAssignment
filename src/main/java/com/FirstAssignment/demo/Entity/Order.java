package com.FirstAssignment.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderID;
    private LocalDateTime creationDateTime;
    private Long customerId;

    public Order(){

    }

    public Order(Long orderID, LocalDateTime creationDateTime, Long customerId) {
        this.orderID = orderID;
        this.creationDateTime = creationDateTime;
        this.customerId = customerId;
    }

    public Long getOrderID() {
        return orderID;
    }

    public void setOrderID(Long orderID) {
        this.orderID = orderID;
    }

    public LocalDateTime getCreationDateTime() {
        return creationDateTime;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public void setCreationDateTime(LocalDateTime creationDateTime) {
        this.creationDateTime = creationDateTime;
    }
}
