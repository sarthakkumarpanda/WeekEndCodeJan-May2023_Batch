package com.javacode_14thMay_2023_ExceptionHandling;

public class PrintExceptionInformation {

	public static void main(String[] args) {

		try {
			int a = 100, b = 0, c;
			c = a / b;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("---------------------------------------------------");
			System.out.println(e);
			System.out.println("----------------------------------------------------");
			System.out.println(e.toString());
			System.out.println("-----------------------------------------------------");
			System.out.println(e.getMessage());
		}

	}

}
