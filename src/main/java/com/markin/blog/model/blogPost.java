package com.markin.blog.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Date;

@Document(collection = "blogposts")
@Data
public class blogPost {
  @Id private String id;

  private String title;

  private String content;

  private Date createdDate = new Date();

  private Date lastModifiedDate = new Date();

  @DBRef private user author;

}
