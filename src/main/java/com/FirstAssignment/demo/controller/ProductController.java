package com.FirstAssignment.demo.controller;

import com.FirstAssignment.demo.Entity.Product;
import com.FirstAssignment.demo.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @Autowired
    public ProductController(ProductService customerService) {

        this.productService = customerService;
    }

    @GetMapping
    public ResponseEntity<List<Product>> addProductMessage(){
        List<Product> products = productService.getAllProducts();
        return new ResponseEntity<>(products, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Product> createProduct(@RequestBody Product newProduct){
        Product product = productService.createProduct(newProduct);
        return new ResponseEntity<>(product, HttpStatus.OK);
    }

    @GetMapping("/{skuID}")
    public ResponseEntity<Product> getProduct(@PathVariable Long skuID){
        Product product = productService.getProductBySKUID(skuID);
        return product != null ? new ResponseEntity<>(product, HttpStatus.OK) : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PutMapping("/{skuID}")
    public ResponseEntity<Product> updateProduct(@PathVariable Long skuID, @RequestBody Product updatedProduct){
        productService.updateProduct(skuID, updatedProduct);
        Product updatedProd = productService.getProductBySKUID(skuID);
        return updatedProduct != null ? new ResponseEntity<>(updatedProd, HttpStatus.OK) : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/{skuID}")
    public ResponseEntity<Void> deleteCustomer(@PathVariable Long skuID){
        productService.deleteProduct(skuID);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
