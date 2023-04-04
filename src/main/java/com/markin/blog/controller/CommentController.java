package com.markin.blog.controller;

import org.springframework.web.bind.annotation.*;

@RestController("/api/v1/comments")
public class CommentController {
  // Create a new comment
  @PostMapping("/create")
  public void create() {
    // TODO
  }
  // Update a comment
  @PutMapping("/update")
  public void update() {
    // TODO
  }
  // Delete a comment
  @DeleteMapping("/delete")
  public void delete() {
    // TODO
  }
  // Get a comment
  @GetMapping("/view")
  public void get() {
    // TODO
  }
  // Get all comments
  @GetMapping("/view/all")
  public void getAll() {
    // TODO
  }
  // Get all comments by user
  @GetMapping("/view/all/user")
  public void getAllByUser() {
    // TODO
  }
  // Get all comments by post
  @GetMapping("/view/all/post")
  public void getAllByPost() {
    // TODO
  }
}
