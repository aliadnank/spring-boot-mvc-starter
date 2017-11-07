package com.techconfigs.springboot.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShoppingController {

    @RequestMapping("/hello/{name}")
    @ResponseBody
    public String sayHello(@PathVariable String name){
        return "Hello "+name+"!";
    }
}
