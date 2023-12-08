package com.FirstAssignment.demo.controller;

import com.FirstAssignment.demo.Entity.Product;
import com.FirstAssignment.demo.Repository.ProductServiceRepository;
import com.FirstAssignment.demo.Service.CustomerService;
import com.FirstAssignment.demo.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {

    private ProductService productService;

    @Autowired
    public ProductController(ProductService customerService) {

        this.productService = customerService;
    }
}
