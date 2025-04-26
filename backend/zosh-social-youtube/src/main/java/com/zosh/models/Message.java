package com.zosh.models;

import java.time.LocalDateTime;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data

public class Message {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String content;
	private String image;
	
	private LocalDateTime timeStamp;
	private Boolean is_read;
	
	@ManyToOne
	private User user;
	
	@ManyToOne
//	@JoinColumn(name="chat_id")
	private Chat chat;

	public Message() {
		
	}
	

	public Message(Integer id, String content, String image, LocalDateTime timeStamp, Boolean is_read, User user,
			Chat chat) {
		super();
		this.id = id;
		this.content = content;
		this.image = image;
		this.timeStamp = timeStamp;
		this.is_read = is_read;
		this.user = user;
		this.chat = chat;
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

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Chat getChat() {
		return chat;
	}

	public void setChat(Chat chat) {
		this.chat = chat;
	}
	
	

	

}
