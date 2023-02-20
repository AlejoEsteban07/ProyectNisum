package com.proyectUserNisum.model;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "email")
    private String email;
    
	@Column(name = "password")
    private String password;
	
	@Column(name = "createdUser")
    private LocalDateTime createdUser;
	
	@Column(name = "modifiedUser")
    private LocalDateTime modifiedUser;
	
	@Column(name = "lastLogin")
    private LocalDateTime lastLogin;
	
	@Column(name = "token")
    private String token;
	
	@Column(name = "isActive")
    private Integer isActive;
	
	@OneToMany(mappedBy="user")
    private List<Phone> phone;

	public User() {
	}

	public User(Long id, String name, String email, String password, LocalDateTime createdUser, LocalDateTime modifiedUser,
			LocalDateTime lastLogin, String token, Integer isActive) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public LocalDateTime getCreatedUser() {
		return createdUser;
	}

	public void setCreatedUser(LocalDateTime createdUser) {
		this.createdUser = createdUser;
	}

	public LocalDateTime getModifiedUser() {
		return modifiedUser;
	}

	public void setModifiedUser(LocalDateTime modifiedUser) {
		this.modifiedUser = modifiedUser;
	}

	public LocalDateTime getLastLogin() {
		return lastLogin;
	}

	public void setLastLogin(LocalDateTime lastLogin) {
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

	public List<Phone> getPhone() {
		return phone;
	}

	public void setPhone(List<Phone> phone) {
		this.phone = phone;
	}
	
	

	
	


}
