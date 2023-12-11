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
}
