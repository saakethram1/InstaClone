package com.zosh.models;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.zosh.dto.UserDto;

import jakarta.persistence.CascadeType;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data

@Entity
@Table(name = "users")
public class User {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String username;
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	private String password;
	private String email;
	private String firstName;
	private String lastName;
	private String mobile;
	private String website;
	private String bio;
	private String gender;
	private String image;
	
	@JsonIgnore
	@ManyToMany
	private Set<User> follower = new HashSet<>();
	
	@JsonIgnore
	@ManyToMany(mappedBy = "follower",fetch = FetchType.LAZY)
	private Set<User> following = new HashSet<User>();

	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Story> stories = new ArrayList<>();

	@JsonIgnore
	@ManyToMany
	private List<Post> savedPosts = new ArrayList<>();
	
	@JsonManagedReference
	@JsonIgnore
	@ManyToMany
	private List<Post> reposts = new ArrayList<>();
	
	@JsonBackReference
	@JsonIgnore
	@OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
	private List<Notification> notifications=new ArrayList<>();
	
	public User() {
		
	}
	public User(Integer id, String username, String password, String email, String firstName, String lastName,
			String mobile, String website, String bio, String gender, String image, Set<User> follower,
			Set<User> following, List<Story> stories, List<Post> savedPosts, List<Post> reposts,
			List<Notification> notifications) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobile = mobile;
		this.website = website;
		this.bio = bio;
		this.gender = gender;
		this.image = image;
		this.follower = follower;
		this.following = following;
		this.stories = stories;
		this.savedPosts = savedPosts;
		this.reposts = reposts;
		this.notifications = notifications;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
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
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getBio() {
		return bio;
	}
	public void setBio(String bio) {
		this.bio = bio;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public Set<User> getFollower() {
		return follower;
	}
	public void setFollower(Set<User> follower) {
		this.follower = follower;
	}
	public Set<User> getFollowing() {
		return following;
	}
	public void setFollowing(Set<User> following) {
		this.following = following;
	}
	public List<Story> getStories() {
		return stories;
	}
	public void setStories(List<Story> stories) {
		this.stories = stories;
	}
	public List<Post> getSavedPosts() {
		return savedPosts;
	}
	public void setSavedPosts(List<Post> savedPosts) {
		this.savedPosts = savedPosts;
	}
	public List<Post> getReposts() {
		return reposts;
	}
	public void setReposts(List<Post> reposts) {
		this.reposts = reposts;
	}
	public List<Notification> getNotifications() {
		return notifications;
	}
	public void setNotifications(List<Notification> notifications) {
		this.notifications = notifications;
	}

	
}
