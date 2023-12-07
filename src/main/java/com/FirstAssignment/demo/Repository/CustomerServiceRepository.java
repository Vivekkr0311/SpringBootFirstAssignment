package com.FirstAssignment.demo.Repository;

import com.FirstAssignment.demo.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerServiceRepository extends JpaRepository<Customer, Long> {
}
