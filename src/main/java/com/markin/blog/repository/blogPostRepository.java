package com.markin.blog.repository;

import com.markin.blog.model.blogPost;
import com.markin.blog.model.user;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface blogPostRepository extends MongoRepository<blogPost, String> {

  // Find all posts by author
  List<blogPost> findBlogPostByAuthor(user author);

  // Find all posts by title
  List<blogPost> findBlogPostByTitle(String title);

    //Find post by ID only
    blogPost findBlogPostById(String id);

    //Update title or content
    blogPost updateBlogPostById(String id, String title, String content);

    //Delete post by ID only
    blogPost deleteBlogPostById(String id);
}
