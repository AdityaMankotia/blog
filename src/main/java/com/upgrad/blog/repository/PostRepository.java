package com.upgrad.blog.repository;

import com.upgrad.blog.modal.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Integer> {
}
