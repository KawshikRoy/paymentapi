package com.itcbd.paymentapi.controller;
import com.itcbd.paymentapi.Entity.Customer;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@RestController
@RequestMapping("/api/v1")
public class PaymentController {
    @GetMapping("/getuserlist")
    public ResponseEntity<?> getGreeting() {

        Customer[] usersArray = {
                new Customer("101", "Alice", "alice@example.com","+8801918753159"),
                new Customer("102", "Bob", "bob@example.com","+8801918753160"),
                new Customer("103", "Charlie", "charlie@example.com","+8801918753161")
        };

        // Convert the array to a list using Arrays.asList
        List<Customer> listOfArrays = Arrays.asList(usersArray);
        return new ResponseEntity<>(listOfArrays, HttpStatus.OK);
    }
}
