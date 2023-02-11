package com.peaksoft.springbootpro.controller;

import com.peaksoft.springbootpro.entity.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping()
public class HelloController {
    @GetMapping
    public String mainView(){
        return "main";
    }
    @GetMapping("/login")
    public String login(){
        return "login";
    }
}
