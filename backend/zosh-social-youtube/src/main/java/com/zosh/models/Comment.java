package com.zosh.models;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import com.zosh.dto.UserDto;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data

public class Comment {
	
	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@NotNull
	private String content;
	
	@ManyToOne
	private User user;

	@ManyToMany
	private Set<User> liked= new HashSet<>();
	
	private LocalDateTime createdAt;
	
	public Comment() {
		
	}
	public Comment(Integer id, String content, User user, Set<User> liked, LocalDateTime createdAt) {
		super();
		this.id = id;
		this.content = content;
		this.user = user;
		this.liked = liked;
		this.createdAt = createdAt;
	}
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
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Set<User> getLiked() {
		return liked;
	}
	public void setLiked(Set<User> liked) {
		this.liked = liked;
	}
	public LocalDateTime getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

}
