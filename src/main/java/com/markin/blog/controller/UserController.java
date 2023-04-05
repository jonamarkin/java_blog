package com.markin.blog.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/users")
@Validated
@Slf4j
public class UserController {

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

    // View all users
    @GetMapping("/view/all")
    public void getAll() {
        // TODO
    }

    //View a user
    @GetMapping("/view/{id}")
    public void get() {
        // TODO
    }

}
