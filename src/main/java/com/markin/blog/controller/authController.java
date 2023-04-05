package com.markin.blog.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
public class authController {
  // User signup
  @PostMapping("/signup")
  public void signup() {
    // TODO
  }
    // User login
    @PostMapping("/login")
    public void login() {
        // TODO
    }
    // User logout
    @PostMapping("/logout")
    public void logout() {
        // TODO
    }

}
