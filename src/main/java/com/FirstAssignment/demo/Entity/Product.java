package com.FirstAssignment.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long skuID;
    private String label;
    private String product_description;
    private int stock;
    private int leadtime;

    public Product(){

    }

    public Product(String label, String product_description, int stock, int leadtime) {
        this.label = label;
        this.product_description = product_description;
        this.stock = stock;
        this.leadtime = leadtime;
    }

    public Long getSkuID() {
        return skuID;
    }

    public void setSkuID(Long skuID) {
        this.skuID = skuID;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getProduct_description() {
        return product_description;
    }

    public void setProduct_description(String product_description) {
        this.product_description = product_description;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getLeadtime() {
        return leadtime;
    }

    public void setLeadtime(int leadtime) {
        this.leadtime = leadtime;
    }
}
