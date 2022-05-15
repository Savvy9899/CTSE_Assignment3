package com.customerservice.sellingapp.CustomerService.Service;

import com.customerservice.sellingapp.CustomerService.Model.Customer;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public interface CustomerService {
    Customer addCustomer(Customer customer);
    List<Customer> getAllCustomers();
    Customer updateCustomer(Customer customer);
    Optional<Customer> getCustomerById(Integer id);
    boolean deleteCustomer(Integer id);
}
