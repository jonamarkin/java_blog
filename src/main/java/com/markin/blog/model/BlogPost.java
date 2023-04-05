package com.markin.blog.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;import java.util.ArrayList;import java.util.Date;import java.util.List;

@Document(collection = "blogposts")
@Data
public class BlogPost {
  @Id private String id;

  private String title;

  private String content;

  private Date createdDate = new Date();

  private Date lastModifiedDate = new Date();

  @DBRef private User author;

}
