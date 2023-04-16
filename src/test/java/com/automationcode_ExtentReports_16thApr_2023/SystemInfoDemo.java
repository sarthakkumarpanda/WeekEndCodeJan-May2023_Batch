package com.automationcode_ExtentReports_16thApr_2023;

public class SystemInfoDemo {

	public static void main(String[] args) {
	System.getProperties().list(System.out);
	
	System.out.println(System.getProperty("os.name"));
	System.out.println(System.getProperty("os.version"));
	System.out.println(System.getProperty("user.name"));
	System.out.println(System.getProperty("java.vendor"));
	
	}

}
