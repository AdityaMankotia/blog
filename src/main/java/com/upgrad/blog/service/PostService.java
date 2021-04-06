package com.upgrad.blog.service;

import com.upgrad.blog.modal.Post;
import com.upgrad.blog.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class PostService {
    @Autowired
    private PostRepository postRepository;
    public List<Post>getAllPosts(){
        return (List<Post>) this.postRepository.findAll();
    }
    public Post getPost(Integer id){
        Optional<Post> post = this.postRepository.findById(id);
        if (post.isPresent()){
            return post.get();
        }
        else {
            return null;
        }
    }
}
