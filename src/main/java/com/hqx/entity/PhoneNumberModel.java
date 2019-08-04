package com.hqx.entity;

//如格式010-12345678 
public class PhoneNumberModel {
	private String areaCode;// 区号
	private String phoneNumber;// 电话号码

	public String getAreaCode() {
		return areaCode;
	}

	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "PhoneNumberModel [areaCode=" + areaCode + ", phoneNumber=" + phoneNumber + "]";
	}

	
}
