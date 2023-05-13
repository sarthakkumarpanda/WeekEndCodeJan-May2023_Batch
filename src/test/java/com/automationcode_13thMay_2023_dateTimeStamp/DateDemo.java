package com.automationcode_13thMay_2023_dateTimeStamp;

import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		System.out.println(date.toString().replace(" ", "_"));
		System.out.println(date.toString().replace(" ", "_").replace(":", "_"));
		

	}

}
