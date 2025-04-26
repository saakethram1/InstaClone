package com.zosh.dto;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.zosh.models.Comment;
import com.zosh.models.User;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Data
public class PostDto {
	
	public PostDto() {
		
	}

	public PostDto(Integer id, String caption, String image, LocalDateTime createdAt, UserDto user,
			List<CommentDto> comments, List<UserDto> liked, boolean likedByRequser, boolean savedByRequser) {
		super();
		this.id = id;
		this.caption = caption;
		this.image = image;
		this.createdAt = createdAt;
		this.user = user;
		this.comments = comments;
		this.liked = liked;
		this.likedByRequser = likedByRequser;
		this.savedByRequser = savedByRequser;
	}

	private Integer id;
	
	private String caption;
	
	private String image;

	private LocalDateTime createdAt;
	
	private UserDto user;
	
	private List<CommentDto> comments=new ArrayList<>();
	
	private List<UserDto> liked= new ArrayList<>(); 
	
	private boolean likedByRequser;
	
	private boolean savedByRequser;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCaption() {
		return caption;
	}

	public void setCaption(String caption) {
		this.caption = caption;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public UserDto getUser() {
		return user;
	}

	public void setUser(UserDto user) {
		this.user = user;
	}

	public List<CommentDto> getComments() {
		return comments;
	}

	public void setComments(List<CommentDto> comments) {
		this.comments = comments;
	}

	public List<UserDto> getLiked() {
		return liked;
	}

	public void setLiked(List<UserDto> liked) {
		this.liked = liked;
	}

	public boolean isLikedByRequser() {
		return likedByRequser;
	}

	public void setLikedByRequser(boolean likedByRequser) {
		this.likedByRequser = likedByRequser;
	}

	public boolean isSavedByRequser() {
		return savedByRequser;
	}

	public void setSavedByRequser(boolean savedByRequser) {
		this.savedByRequser = savedByRequser;
	}
	

}
