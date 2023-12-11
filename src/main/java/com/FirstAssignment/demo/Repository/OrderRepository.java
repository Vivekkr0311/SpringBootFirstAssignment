package com.FirstAssignment.demo.Repository;

import com.FirstAssignment.demo.Entity.CommerceItem;
import com.FirstAssignment.demo.Entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
