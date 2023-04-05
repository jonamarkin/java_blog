package com.markin.blog.dto;

import lombok.Data;

@Data
public class blogPostDto {
    private String title;
    private String content;
    private String category;
    private String author;
}
