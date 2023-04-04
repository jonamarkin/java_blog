package com.markin.blog.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Date;

@Document(collection = "comments")
@Data
public class Comment {
  @Id private String id;

  private String content;

  private Date createdDate = new Date();

  @DBRef private User author;

  @DBRef private BlogPost blogPost;
}
