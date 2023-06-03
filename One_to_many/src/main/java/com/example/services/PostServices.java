package com.example.services;

import java.util.List;
import java.util.Optional;

import com.example.entity.Post;

public interface PostServices {
	//create
	public Post createPost(Post post);
	// get all
	public List<Post> getAllPosts();
	// get by id
	public Optional<Post> getByIdPost(int id);
	//update
	public Post updatePost(Post post);
	//delete
	public String deletePost(int id);
}
