package com.markin.blog.repository;

import com.markin.blog.model.BlogPost;
import com.markin.blog.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface BlogPostRepository extends MongoRepository<BlogPost, String> {
    List<BlogPost> findByAuthor(User author);
}
