package com.zosh.dto;

import com.zosh.models.User;

import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
public class ReelsDto {
	
	public ReelsDto() {
		
	}
	public ReelsDto(Long id, String title, String video, UserDto user) {
		super();
		this.id = id;
		this.title = title;
		this.video = video;
		this.user = user;
	}

	private Long id;
	private String title;
	private String video;
	
	private UserDto user;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getVideo() {
		return video;
	}

	public void setVideo(String video) {
		this.video = video;
	}

	public UserDto getUser() {
		return user;
	}

	public void setUser(UserDto user) {
		this.user = user;
	}

}
