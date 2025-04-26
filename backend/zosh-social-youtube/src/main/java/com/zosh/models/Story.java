package com.zosh.models;

import java.time.LocalDateTime;

import com.zosh.dto.UserDto;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="stories")
@Data

public class Story {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@ManyToOne
	private User user;
	
	@NotNull
	private String image;
	private String captions;
	private LocalDateTime timestamp;
	


	public Story() {
		
	}
	public Story(Integer id, User user, String image, String captions, LocalDateTime timestamp) {
		super();
		this.id = id;
		this.user = user;
		this.image = image;
		this.captions = captions;
		this.timestamp = timestamp;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getCaptions() {
		return captions;
	}
	public void setCaptions(String captions) {
		this.captions = captions;
	}
	public LocalDateTime getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}
	

	
	
	

}
