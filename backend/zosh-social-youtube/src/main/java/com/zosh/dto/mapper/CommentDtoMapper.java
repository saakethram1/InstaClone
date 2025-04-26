package com.zosh.dto.mapper;

import java.util.ArrayList;
import java.util.List;

import com.zosh.dto.CommentDto;
import com.zosh.dto.UserDto;
import com.zosh.models.Comment;
import com.zosh.models.User;

public class CommentDtoMapper {
	
	
	public static CommentDto toCommentDTO(Comment comment) {
		UserDto userDto=UserDtoMapper.userDTO(comment.getUser());
		List<User> likedUsers=new ArrayList<>(comment.getLiked());
		List<UserDto> userDtos = UserDtoMapper.userDTOS(likedUsers);
		
		CommentDto commentDto=new CommentDto();
		commentDto.setContent(comment.getContent());
		commentDto.setCreatedAt(comment.getCreatedAt());
		commentDto.setId(comment.getId());
		commentDto.setLiked(userDtos);
		commentDto.setUser(userDto);
		
		return commentDto;
	}
	
	public static List<CommentDto> toCommentDtos(List<Comment> comments){
		List<CommentDto> commentDtos=new ArrayList<>();
		
		for(Comment comment: comments) {
			
			CommentDto commentDto=toCommentDTO(comment);
			commentDtos.add(commentDto);
			
		}
		
		return commentDtos;
	}

}
