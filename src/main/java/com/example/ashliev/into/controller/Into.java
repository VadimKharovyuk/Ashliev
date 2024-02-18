package com.example.ashliev.into.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/intro")
public class Into {
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String index(){
        return "index";
    }
    @RequestMapping(value = "/about",method = RequestMethod.GET)
    public String About(){
        return "about";
    }
    @RequestMapping(value = "/users",method = RequestMethod.GET)
    public String users(){
        return "users";
    }
}
