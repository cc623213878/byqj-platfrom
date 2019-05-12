package com.byqj.byqjplatformspring.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/hello")
public class HelloWord {
    @RequestMapping
    public String getHelloWord(){
        return "Helo word!";
    }
}
