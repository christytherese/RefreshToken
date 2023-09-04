package com.example.demo.controller;

import com.example.demo.service.UserSecService;
import com.example.demo.vo.UserSecVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class RegistrationController {
    @Autowired
    UserSecService userSecService;
    @PostMapping("/register_user")
    public String RegisterUser(@RequestBody UserSecVO userSecVO){

    }
}
