package ru.netology.restregistr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ru.netology.restregistr.en.Authorities;
import ru.netology.restregistr.service.AuthorizationService;

import java.util.List;

@Controller
public class AuthorizationController {
    @Autowired
    private AuthorizationService service;

    @ResponseBody
    @GetMapping("/authorize")
    public List<Authorities> getAuthorities(@RequestParam("user") String user, @RequestParam("password") String password) {
        return service.getAuthorities(user, password);
    }
    @GetMapping("/signin")
    public String signin(){
        return "signin";
    }
}