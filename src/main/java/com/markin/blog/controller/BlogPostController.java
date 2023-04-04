package com.markin.blog.controller;

import org.springframework.web.bind.annotation.*;

@RestController("/api/v1/posts")
public class BlogPostController {
    //Create a new post
    @PostMapping("/create")
    public void create() {
        //TODO
    }
    //Update a post
    @PutMapping("/update")
    public void update() {
        //TODO
    }
    //Delete a post
    @DeleteMapping("/delete")
    public void delete() {
        //TODO
    }
    //Get a post
    @GetMapping("/view")
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
