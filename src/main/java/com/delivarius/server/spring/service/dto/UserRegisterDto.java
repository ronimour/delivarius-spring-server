package com.delivarius.server.spring.service.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.delivarius.server.spring.domain.UserType;

public class UserRegisterDto implements DataTransferObject {
	
	private static final long serialVersionUID = 1L;

	@NotNull
	private UserDto user;
	
	@NotEmpty
	private String password;
	
	@NotNull
	private UserType type;
	
	public UserRegisterDto() {}

	public UserDto getUser() {
		return user;
	}

	public void setUser(UserDto user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public UserType getType() {
		return type;
	}

	public void setType(UserType type) {
		this.type = type;
	}

}
