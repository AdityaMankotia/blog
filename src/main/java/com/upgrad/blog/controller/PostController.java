package com.upgrad.blog.controller;

import com.upgrad.blog.modal.Post;
import com.upgrad.blog.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.method.P;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
public class PostController {
    @Autowired
    private PostService postService;
    /*
    /posts       -get
    /posts/id    -get
    /posts       -post
    /posts/id    -delete
    /posts/id    -put
     */
    @RequestMapping("/posts") //localhost:8080/posts -get (response is JSON)
    public List<Post> getAllPosts(){
        return this.postService.getAllPosts();
    }
    @RequestMapping("/posts/{id}")
    public Post getPost(@PathVariable Integer id){
        return this.postService.getPost(id);
    }
    @RequestMapping(method = RequestMethod.POST,value = "/posts")
    public String addPost(@RequestBody Post post){
        post.setDate(new Date());
        postService.addPost(post);
        String response ="{\"success\":true,\"message\":\"Post has been added successfully\"}";
        return response;
    }
}

