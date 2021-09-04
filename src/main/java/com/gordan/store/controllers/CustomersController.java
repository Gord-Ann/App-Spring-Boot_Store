package com.gordan.store.controllers;

import com.gordan.store.models.Customer;
import com.gordan.store.repo.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CustomersController {

    @Autowired
    private CustomerRepo customerRepo;

    @GetMapping("/customers")
    public String customer(Model model) {
        Iterable<Customer> customers = customerRepo.findAll();
        model.addAttribute("customers", customers);
        return "customers";
    }
}
