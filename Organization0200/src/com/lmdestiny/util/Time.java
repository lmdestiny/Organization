package com.lmdestiny.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Time {
	public static void formateDate(String pattern,Date... dates){
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		for(Date d:dates){
			String str = sdf.format(d);
			try {
				d = sdf.parse(str);
				System.out.println(d.toString());
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
	}
}
