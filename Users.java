package com.capg.abms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="users", uniqueConstraints =  @UniqueConstraint(columnNames={"email","mobileNumber"}))
public class Users {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="role",nullable=false)
	private String role;
	
	@Column(name="email",nullable=false)
	private String email;
	
	@Column(name="username",nullable=false)
	private String username;
	
	@Column(name="mobileNumber",nullable=false)
	private String mobileNumber;
	
	@Column(name="password",nullable=false)
	private String password;
	
	@Column(name="confirmPassword",nullable=false)
	private String confirmPassword; 
	
	public Users() {
		
	}

	public Users(long id, String role, String email, String username, String mobileNumber, String password,
			String confirmPassword) {
		super();
		this.id = id;
		this.role = role;
		this.email = email;
		this.username = username;
		this.mobileNumber = mobileNumber;
		this.password = password;
		this.confirmPassword = confirmPassword;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	@Override
	public String toString() {
		return "Users [id=" + id + ", role=" + role + ", email=" + email + ", username=" + username + ", mobileNumber="
				+ mobileNumber + ", password=" + password + ", confirmPassword=" + confirmPassword + "]";
	}
	
	

}
