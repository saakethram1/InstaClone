package com.zosh.dto;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class MessageDto {

	public MessageDto() {
		
	}
	public MessageDto(String content, String image, Integer id, LocalDateTime timeStamp, Boolean is_read, UserDto user,
			ChatDto chat) {
		super();
		this.content = content;
		this.image = image;
		this.id = id;
		this.timeStamp = timeStamp;
		this.is_read = is_read;
		this.user = user;
		this.chat = chat;
	}
	private String content;
	private String image;
	private Integer id;
	private LocalDateTime timeStamp;
	private Boolean is_read;
	private UserDto user;
	private ChatDto chat;
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public LocalDateTime getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(LocalDateTime timeStamp) {
		this.timeStamp = timeStamp;
	}
	public Boolean getIs_read() {
		return is_read;
	}
	public void setIs_read(Boolean is_read) {
		this.is_read = is_read;
	}
	public UserDto getUser() {
		return user;
	}
	public void setUser(UserDto user) {
		this.user = user;
	}
	public ChatDto getChat() {
		return chat;
	}
	public void setChat(ChatDto chat) {
		this.chat = chat;
	}
	
	
	
	
	
}
