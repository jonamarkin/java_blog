package com.markin.blog.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class RegisterRequest {
  private String email;
  private String username;
  private String password;
  private String firstName;
  private String lastName;
}
