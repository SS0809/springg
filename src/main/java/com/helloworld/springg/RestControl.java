package com.helloworld.springg;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControl {
    @RequestMapping("/uc3")
    public String index(){
        return "hello from saurabh";
    }
}
