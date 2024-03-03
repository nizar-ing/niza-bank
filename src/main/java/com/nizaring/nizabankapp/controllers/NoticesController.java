package com.nizaring.nizabankapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NoticesController {
    @GetMapping("/notices")
    public String getAccountDetails(){
        return "Here are the notices details from the DB";
    }
}
