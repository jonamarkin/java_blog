package com.markin.blog.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/posts")
@Validated
@Slf4j
public class BlogPostController {
    //Create a new post
    @PostMapping("/create")
    public void create() {
        //TODO
    }
    //Update a post
    @PutMapping("/update/{id}")
    public void update() {
        //TODO
    }
    //Delete a post
    @DeleteMapping("/delete")
    public void delete() {
        //TODO
    }
    //Get a post
    @GetMapping("/view/{id}")
    public void get() {
        //TODO
    }
    //Get all posts
    @GetMapping("/view/all")
    public void getAll() {
        //TODO
    }
    //Get all posts by user
    @GetMapping("/view/all/user")
    public void getAllByUser() {
        //TODO
    }
}
