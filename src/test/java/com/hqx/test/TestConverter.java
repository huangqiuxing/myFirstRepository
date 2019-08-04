package com.hqx.test;

import org.junit.Test;

import com.hqx.converter.StringToPhoneNumberConverter;
import com.hqx.entity.PhoneNumberModel;

public class TestConverter {

	@Test
	public void test01() {
		StringToPhoneNumberConverter converter = new StringToPhoneNumberConverter();
		String s = "0797-12345673";
		PhoneNumberModel phoneNumber = converter.convert(s);
		String areaCode = phoneNumber.getAreaCode();
		String phoneNumber2 = phoneNumber.getPhoneNumber();
		System.out.println(areaCode);
		System.out.println(phoneNumber2);
	}
}
