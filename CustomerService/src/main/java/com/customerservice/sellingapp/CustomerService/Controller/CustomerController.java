package com.customerservice.sellingapp.CustomerService.Controller;

import com.customerservice.sellingapp.CustomerService.Model.Customer;
import com.customerservice.sellingapp.CustomerService.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@CrossOrigin
@RestController
@RequestMapping("/customerService")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @PostMapping("/add")
    public Customer addCustomer(@RequestBody Customer customer){
        return customerService.addCustomer(customer);
    }

//    @GetMapping("/allCustomers")
//    public List<Customer> getAllCustomers(){ return customerService.getAllCustomers();}
//
//    @PutMapping("/updateDriver")
//    public Customer updateDriver(@RequestBody Customer customer) { return CustomerService.updateCustomer(customer);}
//
//    @GetMapping("/getCustomerById/{id}")
//    public Optional<Customer> getCustomerById(@PathVariable String id){ return customerService.getCustomerById(id);}
//
//    @DeleteMapping("/deleteCustomerById/{id}")
//    public boolean deleteCustomerById(@PathVariable String id){ return  customerService.deleteCustomer(id);}
}
