package com.zosh.models;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
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
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="posts")
@Data

public class Post {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String caption;
	
	private String image;
	
	private String video;
	
	private String location;
	
	private LocalDateTime createdAt;
	
	@ManyToOne
	private User user;
	
	@OneToMany
	private List<Comment> comments=new ArrayList<Comment>();
	
	@ManyToMany
	private Set<User> liked= new HashSet<>(); 
	public Post() {
		
	}
	public Post(Integer id, String caption, String image, String video, String location, LocalDateTime createdAt,
			User user, List<Comment> comments, Set<User> liked) {
		super();
		this.id = id;
		this.caption = caption;
		this.image = image;
		this.video = video;
		this.location = location;
		this.createdAt = createdAt;
		this.user = user;
		this.comments = comments;
		this.liked = liked;
	}
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
	public String getVideo() {
		return video;
	}
	public void setVideo(String video) {
		this.video = video;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public LocalDateTime getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public List<Comment> getComments() {
		return comments;
	}
	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}
	public Set<User> getLiked() {
		return liked;
	}
	public void setLiked(Set<User> liked) {
		this.liked = liked;
	}

	

	
	
}
