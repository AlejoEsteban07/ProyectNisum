package com.proyectUserNisum.dto;

import java.util.Date;

import com.proyectUserNisum.model.Phone;


public class UserDTO {
	
	private Long id;
	private String name;
	private String password;
	private Phone phones;
	private Date createdUser;
	private Date modifiedUser;
	private Date lastLogin;
	private String token;
	private Integer isActive;
	
	
	public UserDTO() {
	}


	public UserDTO(Long id, String name, String password, Phone phones, Date createdUser, Date modifiedUser,
			Date lastLogin, String token, Integer isActive) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.phones = phones;
		this.createdUser = createdUser;
		this.modifiedUser = modifiedUser;
		this.lastLogin = lastLogin;
		this.token = token;
		this.isActive = isActive;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public Phone getPhones() {
		return phones;
	}


	public void setPhones(Phone phones) {
		this.phones = phones;
	}


	public Date getCreatedUser() {
		return createdUser;
	}


	public void setCreatedUser(Date createdUser) {
		this.createdUser = createdUser;
	}


	public Date getModifiedUser() {
		return modifiedUser;
	}


	public void setModifiedUser(Date modifiedUser) {
		this.modifiedUser = modifiedUser;
	}


	public Date getLastLogin() {
		return lastLogin;
	}


	public void setLastLogin(Date lastLogin) {
		this.lastLogin = lastLogin;
	}


	public String getToken() {
		return token;
	}


	public void setToken(String token) {
		this.token = token;
	}


	public Integer getIsActive() {
		return isActive;
	}


	public void setIsActive(Integer isActive) {
		this.isActive = isActive;
	}
	
	
	

}
