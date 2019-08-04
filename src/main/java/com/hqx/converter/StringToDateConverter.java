package com.hqx.converter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;
import org.springframework.util.StringUtils;

/**
 * 日期字符串转换为日期格式
 */
public class StringToDateConverter implements Converter<String, Date> {

	private String dateFormatPattern;

	public StringToDateConverter(String dateFormatPattern) {
		this.dateFormatPattern = dateFormatPattern;  //dateFormatPattern==>yyyy-MM-dd
	}

	@Override
	public Date convert(String source) {
		if (!StringUtils.hasLength(source)) {
			// ①如果source为空 返回null
			return null;
		}
		DateFormat df = new SimpleDateFormat(dateFormatPattern); //dateFormatPattern==>yyyy-MM-dd
		try {
			// ②转换成功
			return df.parse(source);
		} catch (ParseException e) {
			// ③转化失败
			throw new IllegalArgumentException(String.format("类型转换失败，需要格式%s，但格式是[%s]", dateFormatPattern, source));
		}
	}

}
