package com.customerservice.sellingapp.CustomerService.Service.Impl;

import com.customerservice.sellingapp.CustomerService.Model.Customer;
import com.customerservice.sellingapp.CustomerService.Repositories.CustomerRepository;
import com.customerservice.sellingapp.CustomerService.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public Customer addCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public List<Customer> getAllCustomers() {
        return (List<Customer>) customerRepository.findAll();
    }

    @Override
    public Customer updateCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public Optional<Customer> getCustomerById(Integer id) {
        return customerRepository.findById(id);
    }

    @Override
    public boolean deleteCustomer(Integer id) {
        return false;
    }
}
