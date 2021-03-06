package com.ncs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@Controller
public class HomeController {
    
    @GetMapping("/")
    public String index(){
        return "shared";
    }
    
    @GetMapping("/login")
    public String login(){
        return "login";
    }
    
    @GetMapping("/user")
    public String user(){
        return "user";
    }
    
    @GetMapping("/admin")
    public String admin(){
        return "admin";
    }
}
