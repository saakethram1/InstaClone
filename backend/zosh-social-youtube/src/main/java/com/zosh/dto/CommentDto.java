package com.zosh.dto;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.zosh.models.User;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class CommentDto {
	
	public CommentDto() {
		
	}

	public CommentDto(Integer id, String content, UserDto user, List<UserDto> liked, LocalDateTime createdAt) {
		super();
		this.id = id;
		this.content = content;
		this.user = user;
		this.liked = liked;
		this.createdAt = createdAt;
	}

	private Integer id;
	
	private String content;
	
	private UserDto user;

	private List<UserDto> liked= new ArrayList<>();
	
	private LocalDateTime createdAt;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public UserDto getUser() {
		return user;
	}

	public void setUser(UserDto user) {
		this.user = user;
	}

	public List<UserDto> getLiked() {
		return liked;
	}

	public void setLiked(List<UserDto> liked) {
		this.liked = liked;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

}
