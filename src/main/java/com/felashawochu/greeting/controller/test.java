package com.felashawochu.greeting.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test {

    @RequestMapping("/greeting")
    public String test(){
        return "Endet nachu";
    }

    @RequestMapping("/farewell")
    public String test1(){
        return "Dena derulign ke ashena balebetu";
    }

}
