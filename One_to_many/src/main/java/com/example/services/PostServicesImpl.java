package com.example.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Post;
import com.example.repo.PostRepo;

@Service
public class PostServicesImpl implements PostServices{
	@Autowired
	private PostRepo postRepo;
	@Override
	public Post createPost(Post post) {
		Post savedPost = postRepo.save(post);
		return savedPost;
	}

	@Override
	public List<Post> getAllPosts() {
		List<Post> postList = postRepo.findAll();
		return postList;
	}

	@Override
	public Optional<Post> getByIdPost(int id) {
		Optional<Post> OptionalPost = postRepo.findById(id);
		return OptionalPost;
	}

	@Override
	public Post updatePost(Post post) {
	 Post post2 = postRepo.findById(post.getId()).get();
		post2.setTitle(post.getTitle());
		post2.setDescs(post.getDescs());
		post2.setComments(post.getComments());
		Post save = postRepo.save(post2);
		return save;
	}

	@Override
	public String deletePost(int id) {
		postRepo.deleteById(id);
		return "deleted";
		
	}

}
