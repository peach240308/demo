package com.example.AWSTest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeControl {

    @GetMapping("/")
    public String homecontrol() {

        return "Hello, world";
    }
}
