package com.zosh.request;

import lombok.Data;

@Data
public class SingleChatRequest {
	
	public SingleChatRequest(Integer userId) {
		super();
		this.userId = userId;
	}

	private Integer userId;

	public SingleChatRequest() {
		
	}
	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}


}
