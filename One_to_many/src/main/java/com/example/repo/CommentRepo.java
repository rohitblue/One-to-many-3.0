package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Comment;

@Repository
public interface CommentRepo extends JpaRepository<Comment, Integer>{

}
