package com.customerservice.sellingapp.CustomerService.Repositories;

import com.customerservice.sellingapp.CustomerService.Model.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends MongoRepository<Customer, Integer> {
}
