package com.example.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Post;
import com.example.services.PostServices;

@RestController
public class PostController {
	@Autowired
	private PostServices postServices;
	
	@GetMapping("/posts")
	public List<Post> getall(){
		List<Post> allPosts = postServices.getAllPosts();

//		System.out
		return allPosts;
	}
	
	@PostMapping("/posts")
	public Post createPost(@RequestBody Post post) {
		Post createPost = postServices.createPost(post);
		return createPost;
	}
	
	@GetMapping("posts/{id}")
	public Optional<Post> getPost(@PathVariable("id") int id) {
		Optional<Post> byIdPost = postServices.getByIdPost(id);
		return byIdPost;
	}
	
	@PutMapping("posts")
	public Post updatePost(@RequestBody Post post) {
		Post updatePost = postServices.updatePost(post);
		return updatePost;
	}
	
	@DeleteMapping("posts/{id}")
	public String Delete(@PathVariable("id")int id) {
		String deletePost = postServices.deletePost(id);
		return deletePost;
	}
}
