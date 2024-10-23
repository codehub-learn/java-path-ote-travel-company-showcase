package com.travelcompany.eshop.service;

import com.travelcompany.eshop.domain.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerServiceImpl implements CustomerService {
    private static List<Customer> customers = new ArrayList<>();

    @Override
    public void add(Customer customer) {
        customer.setId(customers.size() + 1L);
        customers.add(customer);
    }

    @Override
    public List<Customer> findAll() {
        return customers;
    }

    @Override
    public Customer get(Long id) {
        for (Customer customer : customers) {
            if (customer.getId().equals(id)) {
                return customer;
            }
        }
        return null;
    }
}
