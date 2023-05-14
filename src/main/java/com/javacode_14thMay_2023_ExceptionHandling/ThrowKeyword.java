package com.javacode_14thMay_2023_ExceptionHandling;

public class ThrowKeyword {

	public static void main(String[] args) {
		int a=100, b=0, c;
		c=a/b;
		System.out.println(c);
		throw new ArithmeticException("Divide By zero");
		//when a programmer uses the keyword throw then the object is passed to jvm by the developer
		
		

	}

}
