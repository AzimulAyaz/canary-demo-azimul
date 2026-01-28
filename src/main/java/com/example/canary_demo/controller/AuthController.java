package com.example.canary_demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class AuthController {

    @GetMapping("/login")
    public ResponseEntity<String> login(){
        String loginInfo = "User Login Successful!!";
        return ResponseEntity.ok(loginInfo);
    }

    @GetMapping("/logout")
    public ResponseEntity<String> logout(){
        String loginInfo = "User Successfully Logged Out!!";
        return ResponseEntity.ok(loginInfo);
    }

}
