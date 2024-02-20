package com.example.ashliev.controller17;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class secontController {
    @GetMapping("/exit")
    public String exit(){
        return "exit" ;
    }
}
