package com.markin.blog.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/users")
@Validated
@Slf4j
public class userController {
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
  // User update
  @PutMapping("/profile/update")
  public void update() {
    // TODO
  }

  // View user profile
  @GetMapping("/profile/view")
  public void view() {
    // TODO
  }
}
