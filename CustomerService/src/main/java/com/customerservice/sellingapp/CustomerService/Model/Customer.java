package com.customerservice.sellingapp.CustomerService.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@Document(collection = "customer")
public class Customer {

    private int cusId;
    private String customerName;
    private String address;
    private int age;
    private String email;
}
