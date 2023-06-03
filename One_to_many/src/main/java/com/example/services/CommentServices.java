package com.example.services;

import java.util.List;

import com.example.entity.Comment;
import com.example.entity.Post;

public interface CommentServices {
		//create
		public Comment createComment(Comment comment);
		// get all
		public List<Comment> getAllComments();
		// get by id
		public Comment getByIdComment(int id);
		//update
		public Comment updateComment(int id);
		//delete
		public String deleteComment(int id);
}
