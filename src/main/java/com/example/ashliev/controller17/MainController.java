package com.example.ashliev.controller17;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/hello")
    public String helloPage(){
        return  "hello";

    }
    @GetMapping("/bay")
    public String bau(){
        return "bay";


    }
}
