package com.joseg.openfeigndemo.client.controller;

import com.joseg.openfeigndemo.client.JsonPlaceHolderFeignClient;
import com.joseg.openfeigndemo.client.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PostController {

    @Autowired
    private JsonPlaceHolderFeignClient jsonPlaceHolderFeignClient;


    @GetMapping("/posts")
    public List<Post> getPosts(){
        return jsonPlaceHolderFeignClient.getPosts();
    }

        @GetMapping("/posts/{postId}")
    public Post getPostById(@PathVariable("postId") Long postId){
        return jsonPlaceHolderFeignClient.getPostById(postId);
    }

}
