package com.markin.blog.dto;

import lombok.Data;

@Data
public class BlogPostDto {
    private String title;
    private String content;
    private String category;
    private String author;
}
