package com.example.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Comment;
import com.example.repo.CommentRepo;

@Service
public class CommentServicesImpl implements CommentServices{
	@Autowired
	private CommentRepo commentRepo;

	@Override
	public Comment createComment(Comment comment) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Comment> getAllComments() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Comment getByIdComment(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Comment updateComment(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteComment(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
