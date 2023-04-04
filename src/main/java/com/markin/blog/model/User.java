package com.markin.blog.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.HashSet;
import java.util.Set;

@Data
@Document(collection = "users")
public class User {
  @Id private String id;

  @Indexed(unique = true)
  @NotNull
  private String username;

  @NotNull private String password;

  @Email private String email;

  @NotNull private String firstName;

  @NotNull private String lastName;
}
