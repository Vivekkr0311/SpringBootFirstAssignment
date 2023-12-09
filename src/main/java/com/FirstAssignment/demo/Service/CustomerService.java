package com.FirstAssignment.demo.Service;

import com.FirstAssignment.demo.Entity.Customer;
import com.FirstAssignment.demo.Entity.Product;
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

    public void updateCustomer(Long customerID, Customer updateCustomer) {
        Customer customer = customerRepository.findById(customerID).orElse(null);

        if (customer != null) {
            // Update the fields of the existing customer
            customer.setFirstName(updateCustomer.getFirstName());
            customer.setLastName(updateCustomer.getLastName());
            customer.setBilling_address(updateCustomer.getBilling_address());
            customer.setDelivery_address(updateCustomer.getDelivery_address());
            customer.setEmail(updateCustomer.getEmail());
            customer.setPhoneNumber(updateCustomer.getPhoneNumber());

            // Save the updated customer
            customerRepository.save(customer);
        }
    }

    public void deleteCustomer(Long customerId) {
        customerRepository.deleteById(customerId);
    }
}
