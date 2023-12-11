package com.FirstAssignment.demo.Repository;

import com.FirstAssignment.demo.Entity.CommerceItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<CommerceItem, Long> {
}
