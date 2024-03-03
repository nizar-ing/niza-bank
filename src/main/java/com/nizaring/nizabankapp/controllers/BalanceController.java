package com.nizaring.nizabankapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BalanceController {
    @GetMapping("/myBalance")
    public String getAccountDetails(){
        return "Here are the balance details from our DB";
    }
}
