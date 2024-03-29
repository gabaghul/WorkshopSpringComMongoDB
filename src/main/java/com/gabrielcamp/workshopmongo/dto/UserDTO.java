package com.gabrielcamp.workshopmongo.dto;

import java.io.Serializable;

import com.gabrielcamp.workshopmongo.domain.User;

public class UserDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String id;
	private String name;
	private String email;
	
	public UserDTO() {
		
	}

	public UserDTO(User user) {
		super();
		this.id = user.getId();
		this.name = user.getName() != null?  user.getName() : null;
		this.email = user.getEmail() != null? user.getEmail() : null;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
