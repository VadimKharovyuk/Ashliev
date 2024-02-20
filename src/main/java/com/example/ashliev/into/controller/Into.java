package com.example.ashliev.into.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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
    @RequestMapping(value = "/user/{id}/name/{name}",method = RequestMethod.GET)
    @ResponseBody
    public String usersById(@PathVariable("id") String id,
                            @PathVariable ("name") String name ){
        return String.format("user name = %s , user ID = %s" ,name,id) ;
    }
}
