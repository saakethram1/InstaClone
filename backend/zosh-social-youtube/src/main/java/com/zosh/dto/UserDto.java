package com.zosh.dto;

import java.util.Objects;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data

public class UserDto {
	
	public UserDto() {
		
	}

	public UserDto(String firstName, String lastName, String email, Integer id, String image) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.id = id;
		this.image = image;
	}
	private String firstName;
	private String lastName;
	private String email;
	private Integer id;
	private String image;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	
}
