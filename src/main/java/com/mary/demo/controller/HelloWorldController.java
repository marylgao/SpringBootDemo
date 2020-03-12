package com.mary.demo.controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping("/hello")
    String home() {
        return "Hello World!";
    }

    @RequestMapping("/test")
    String test(){
        return "test";
    }
}
