package com.customerservice.sellingapp.CustomerService.Service;

import com.customerservice.sellingapp.CustomerService.Model.Customer;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface CustomerService {
    Customer addCustomer(Customer customer);
}
