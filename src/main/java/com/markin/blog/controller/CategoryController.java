package com.markin.blog.controller;

import org.springframework.web.bind.annotation.*;

@RestController("/api/v1/categories")
public class CategoryController {
  // Create a new category
  @PostMapping("/create")
  public void create() {
    // TODO
  }
  // Update a category
  @PutMapping("/update")
  public void update() {
    // TODO
  }
  // Delete a category
  @DeleteMapping("/delete")
  public void delete() {
    // TODO
  }
    //Get a category
    @GetMapping("/view")
    public void get() {
        //TODO
    }
  // Get all categories
  @GetMapping("/view/all")
  public void getAll() {
    // TODO
  }
}
