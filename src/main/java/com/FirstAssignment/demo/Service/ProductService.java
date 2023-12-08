package com.FirstAssignment.demo.Service;

import com.FirstAssignment.demo.Entity.Product;
import com.FirstAssignment.demo.Repository.ProductServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    public ProductServiceRepository productServiceRepository;

    public Product createProduct(Product product){
        return productServiceRepository.save(product);
    }

    public Product getProductBySKUID(Long skuID){
        return productServiceRepository.findById(skuID).orElse(null);
    }

    public void updateProduct(Long skuID, Product updatedProduct){
        productServiceRepository.save(updatedProduct);
    }

    public void deleteProduct(Long skuID){
        productServiceRepository.deleteById(skuID);
    }
}
