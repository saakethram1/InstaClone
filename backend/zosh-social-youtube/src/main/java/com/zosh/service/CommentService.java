package com.zosh.service;

import com.zosh.exception.CommentException;
import com.zosh.exception.PostException;
import com.zosh.exception.UserException;
import com.zosh.models.Comment;

public interface CommentService {
	
	public Comment createComment(Comment comment,Integer postId,Integer userId) throws PostException, UserException;

	public Comment findCommentById(Integer commentId) throws CommentException;
	public Comment likeComment(Integer CommentId,Integer userId) 
			throws UserException, CommentException;
}
