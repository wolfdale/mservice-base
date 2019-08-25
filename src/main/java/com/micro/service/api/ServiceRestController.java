package com.micro.service.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceRestController {
    @GetMapping(value="/api")
    public String init(){
        return "Microservice is UP.";
    }
}
