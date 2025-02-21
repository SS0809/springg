package com.helloworld.springg;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
    @GetMapping("/hello")
    String fn(){
        return "Hello from BridgeLabz";
    }
}
