package com.FirstAssignment.demo.Repository;

import com.FirstAssignment.demo.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductServiceRepository extends JpaRepository<Product, Long> {
}
