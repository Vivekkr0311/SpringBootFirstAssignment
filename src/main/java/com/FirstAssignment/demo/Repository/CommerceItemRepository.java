package com.FirstAssignment.demo.Repository;

import com.FirstAssignment.demo.Entity.CommerceItem;
import com.FirstAssignment.demo.Entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommerceItemRepository extends JpaRepository<CommerceItem, Long> {
    List<CommerceItem> findByOrder(Order order);
}
