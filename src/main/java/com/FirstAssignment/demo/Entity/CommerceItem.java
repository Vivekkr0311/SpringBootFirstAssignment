package com.FirstAssignment.demo.Entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class CommerceItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long itemID;

    @ManyToOne
    @JoinColumn(name = "orderId")
    private Order order;
    private Long productId;
    private int quantity;
    private LocalDate deliveryDate;
    private String status;

    public CommerceItem(){

    }

    public CommerceItem(Long itemID, Order order, Long productId, int quantity, LocalDate deliveryDate, String status) {
        this.itemID = itemID;
        this.order = order;
        this.productId = productId;
        this.quantity = quantity;
        this.deliveryDate = deliveryDate;
        this.status = status;
    }

    public Long getItemID() {
        return itemID;
    }

    public void setItemID(Long itemID) {
        this.itemID = itemID;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(LocalDate deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
