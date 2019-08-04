package com.hqx.entity;

import org.hibernate.validator.constraints.NotEmpty;

public class User {

	@NotEmpty    //非空验证的注解
	private String username;
	@NotEmpty
	private String password;
	@NotEmpty
	private PhoneNumberModel phoneNumberModel;

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

	public PhoneNumberModel getPhoneNumberModel() {
		return phoneNumberModel;
	}

	public void setPhoneNumberModel(PhoneNumberModel phoneNumberModel) {
		this.phoneNumberModel = phoneNumberModel;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", phoneNumberModel=" + phoneNumberModel + "]";
	}

}
