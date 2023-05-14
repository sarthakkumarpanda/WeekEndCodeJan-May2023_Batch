package com.javacode_14thMay_2023_ExceptionHandling;

public class RunTimeExceptions {
	//Exceptions which are not handled by the compiler are known as RunTimeExceptions

	public static void main(String[] args) {
		try {
		int a=100, b=0, c;
		c = a/b;
		}catch (ArithmeticException e) {
			e.printStackTrace();
		}
		System.out.println("I am leaning Automation");

	}

}
