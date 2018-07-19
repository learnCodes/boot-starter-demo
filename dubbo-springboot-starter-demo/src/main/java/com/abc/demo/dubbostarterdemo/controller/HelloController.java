package com.abc.demo.dubbostarterdemo.controller;

import com.abc.dubbo.dubbospringbootstarter.entities.DemoEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController{
    @Autowired
    private DemoEntity demo;
    
    @RequestMapping("/hello/{name}")
    public String helloWorld(@PathVariable("name") String name) {
        return "Hello "+demo.getMessage()+ " "+ name;
    }
}