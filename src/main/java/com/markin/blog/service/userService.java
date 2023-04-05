package com.markin.blog.service;

import com.markin.blog.model.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class userService {
  @Autowired private com.markin.blog.repository.userRepository userRepository;

  // Register a new user
  public void register(user user) {
    //Register a new user
    userRepository.save(user);

  }

  // Login a user
  public void login() {
    // Login a user
    //Check if user exists
    user user = userRepository.findByUsername("username").get();
    //Check if password is correct
    //Generate JWT


  }

  // Logout a user
  public void logout() {}

  // Update a user
  public void update() {}

  // Get a user
  public void get() {}

  // Get all users
  public void getAll() {}
}
