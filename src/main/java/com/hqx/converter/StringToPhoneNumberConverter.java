package com.hqx.converter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.core.convert.converter.Converter;
import org.springframework.util.StringUtils;

import com.hqx.entity.PhoneNumberModel;

/**
 * 用户填写的电话号码字符串转换为(获取)区号部分和电话号码部分
 */
public class StringToPhoneNumberConverter implements Converter<String, PhoneNumberModel> {
	// 先定义一个正则表达式,  为了下面能够分别获取到区号部分和电话号码部分
	Pattern pattern = Pattern.compile("^(\\d{3,4})-(\\d{7,8})$");

	@Override
	public PhoneNumberModel convert(String source) {
		// StringUtils.hasLength(source) 判断字符串source是不是空,返回false就是空
		if (StringUtils.hasLength(source) == false) { // source.length()==0  也行
			return null; // 如果source为空,则说明用户没有填写, 返回null
		} else { // 不是空就进行类型转换(获取其区号和电话号码)
			Matcher matcher = pattern.matcher(source);
			if (matcher.matches()) { // matcher.matches()判断是否符合定义的正则规则, 返回true就是符合, 进行转换(获取其区号和电话号码)
				PhoneNumberModel phoneNumber = new PhoneNumberModel();
				phoneNumber.setAreaCode(matcher.group(1));
				phoneNumber.setPhoneNumber(matcher.group(2));
				return phoneNumber;
			} else {
				// 如果不符合 不能转换 抛出非法字符串异常
				// %s表示占位 占String类型的位
				//throw new IllegalArgumentException(String.format("类型转换失败，需 要的 格 式是 [010-12345678]，但你的格式是[%s]", source));
				throw new IllegalArgumentException("类型转换失败，需 要的 格 式是 [010-12345678]");
			}
		}
	}

}