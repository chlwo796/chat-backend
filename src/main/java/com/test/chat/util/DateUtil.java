package com.test.chat.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateUtil {

	public static String getToDate(String...formats) {
		// String...formats = option 파라미터
		String format = "yyyy-MM-dd HH:mm:ss.SSS";
		if(formats != null && formats.length==1) {
			format = formats[0];
		}
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		Calendar cal = Calendar.getInstance();
		return sdf.format(cal.getTime());
	}

//	public static void main(String[] args) {
//		// 테스트용
//		System.out.println(getToDate());
//		System.out.println(getToDate("yyyy-MM-dd"));
//	}
}
