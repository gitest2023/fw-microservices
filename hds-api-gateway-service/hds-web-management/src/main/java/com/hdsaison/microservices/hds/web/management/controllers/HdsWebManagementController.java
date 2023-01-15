package com.hdsaison.microservices.hds.web.management.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/gateways")
public class HdsWebManagementController {

    @GetMapping
    public String index() {
        return "Hello, Gateway Service";
    }

}
