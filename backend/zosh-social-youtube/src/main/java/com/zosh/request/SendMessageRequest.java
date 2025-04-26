package com.zosh.request;

import lombok.Data;

@Data
public class SendMessageRequest {
	
	public SendMessageRequest(Integer chatId, Integer userId, String content, String image) {
		super();
		this.chatId = chatId;
		this.userId = userId;
		this.content = content;
		this.image = image;
	}
	private Integer chatId;
	private Integer userId;
	private String content;
	private String image;
	public Integer getChatId() {
		return chatId;
	}
	
	public SendMessageRequest() {
		
	}
	public void setChatId(Integer chatId) {
		this.chatId = chatId;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
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
	


}
