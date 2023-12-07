package com.FirstAssignment.demo.Service;

import com.FirstAssignment.demo.Entity.Customer;
import com.FirstAssignment.demo.Repository.CustomerServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    @Autowired
    private CustomerServiceRepository customerRepository;

    public Customer registerCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    public Customer getCustomerById(Long customerId) {
        return customerRepository.findById(customerId).orElse(null);
    }

    public void updateCustomer(Long customerId, Customer updatedCustomer) {
        customerRepository.save(updatedCustomer);
    }

    public void deleteCustomer(Long customerId) {
        customerRepository.deleteById(customerId);
    }
}
