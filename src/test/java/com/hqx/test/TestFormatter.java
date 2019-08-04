package com.hqx.test;

import java.text.ParseException;
import java.util.Locale;

import org.junit.jupiter.api.Test;

import com.hqx.Formatter.PhoneNumberFormatter;
import com.hqx.entity.PhoneNumberModel;

public class TestFormatter {
	PhoneNumberFormatter pnf = new PhoneNumberFormatter();

	@Test
	public void test01() {
		// String==>PhoneNumberModel
		String s = "0797-1234567";
		try {
			PhoneNumberModel parse = pnf.parse(s, new Locale("CN"));
			String areaCode = parse.getAreaCode();
			System.out.println(areaCode);
			// PhoneNumberModel==>String
			String print = pnf.print(parse, new Locale("CN"));
			System.out.println(print);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
