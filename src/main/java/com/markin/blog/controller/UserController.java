package com.markin.blog.controller;

import org.springframework.web.bind.annotation.PostMapping;import org.springframework.web.bind.annotation.PutMapping;import org.springframework.web.bind.annotation.RestController;

@RestController("/api/v1/users")
public class UserController {
    //User signup
    @PostMapping("/signup")
    public void signup() {
        //TODO
    }
    //User login
    @PostMapping("/login")
    public void login() {
        //TODO
    }
    //User logout
    @PostMapping("/logout")
    public void logout() {
        //TODO
    }
    //User update
    @PutMapping("/update")
    public void update() {
        //TODO
    }


}
