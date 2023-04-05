package com.markin.blog.service;

import com.markin.blog.model.User;
import com.markin.blog.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
  @Autowired private UserRepository userRepository;

  // Register a new user
  public void register(User user) {
    //Register a new user
    userRepository.save(user);

  }

  // Login a user
  public void login() {
    // Login a user
    //Check if user exists
    User user = userRepository.findByUsername("username").get();
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
