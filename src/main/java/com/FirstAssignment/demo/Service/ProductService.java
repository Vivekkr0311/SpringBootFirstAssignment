package com.FirstAssignment.demo.Service;

import com.FirstAssignment.demo.Entity.Product;
import com.FirstAssignment.demo.Repository.ProductServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public void updateProduct(Long skuID, Product updatedProduct) {
        Product existingProduct = productServiceRepository.findById(skuID).orElse(null);

        if (existingProduct != null) {
            // Update the fields of the existing product
            existingProduct.setLabel(updatedProduct.getLabel());
            existingProduct.setProduct_description(updatedProduct.getProduct_description());
            existingProduct.setStock(updatedProduct.getStock());
            existingProduct.setLeadtime(updatedProduct.getLeadtime());

            // Save the updated product
            productServiceRepository.save(existingProduct);
        }
    }


    public void deleteProduct(Long skuID){
        productServiceRepository.deleteById(skuID);
    }
    public List<Product> getAllProducts(){
        return productServiceRepository.findAll();
    }
}
