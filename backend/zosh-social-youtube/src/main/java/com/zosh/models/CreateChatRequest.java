package com.zosh.models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class CreateChatRequest {
	
	private Integer userId;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public CreateChatRequest(Integer userId) {
		super();
		this.userId = userId;
	}
	public CreateChatRequest() {
		
	}
	
}
