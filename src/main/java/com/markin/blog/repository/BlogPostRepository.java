package com.markin.blog.repository;

import com.markin.blog.model.BlogPost;
import com.markin.blog.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface BlogPostRepository extends MongoRepository<BlogPost, String> {

    //Find all posts by author
    List<BlogPost> findBlogPostByAuthor(User author);

    //Find all posts by title
    List<BlogPost> findBlogPostByTitle(String title);

    //Find post by ID only
    BlogPost findBlogPostById(String id);

    //Update title or content
    BlogPost updateBlogPostById(String id, String title, String content);

    //Delete post by ID only
    BlogPost deleteBlogPostById(String id);
}
