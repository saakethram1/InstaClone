package com.zosh.dto;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class ChatDto {

	public ChatDto(){
		
	}
	public ChatDto(Integer id, String chat_name, String chat_image, Boolean is_group, List<UserDto> admins,
			UserDto created_by, List<UserDto> users, List<MessageDto> messages) {
		super();
		this.id = id;
		this.chat_name = chat_name;
		this.chat_image = chat_image;
		this.is_group = is_group;
		this.admins = admins;
		this.created_by = created_by;
		this.users = users;
		this.messages = messages;
	}

	private Integer id;
	private String chat_name;
	private String chat_image;
	
	private Boolean is_group;
	
	private List<UserDto> admins= new ArrayList<>();
	
	private UserDto created_by;

	private List<UserDto> users = new ArrayList<>();
	
	private List<MessageDto> messages=new ArrayList<>();

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getChat_name() {
		return chat_name;
	}

	public void setChat_name(String chat_name) {
		this.chat_name = chat_name;
	}

	public String getChat_image() {
		return chat_image;
	}

	public void setChat_image(String chat_image) {
		this.chat_image = chat_image;
	}

	public Boolean getIs_group() {
		return is_group;
	}

	public void setIs_group(Boolean is_group) {
		this.is_group = is_group;
	}

	public List<UserDto> getAdmins() {
		return admins;
	}

	public void setAdmins(List<UserDto> admins) {
		this.admins = admins;
	}

	public UserDto getCreated_by() {
		return created_by;
	}

	public void setCreated_by(UserDto created_by) {
		this.created_by = created_by;
	}

	public List<UserDto> getUsers() {
		return users;
	}

	public void setUsers(List<UserDto> users) {
		this.users = users;
	}

	public List<MessageDto> getMessages() {
		return messages;
	}

	public void setMessages(List<MessageDto> messages) {
		this.messages = messages;
	}

	
	
	
}
