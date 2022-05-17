package com.gordan.store.controllers;

import com.gordan.store.repo.OrderRepo;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/orders")
@AllArgsConstructor
public class OrderController {

    private OrderRepo orderRepo;

    @GetMapping("/orders")
    public String getOrders(Model model){
        return "orders";
    }

    @GetMapping("/add")
    public String relocateToAddOrderPage(Model model){
        return "add-orders";
    }

    @PostMapping("/add")
    public String addOrder(
            @RequestParam String goodName, Model model){
        return "redirect:/orders";
    }

}
