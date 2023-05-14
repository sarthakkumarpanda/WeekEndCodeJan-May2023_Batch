package com.javacode_14thMay_2023_ExceptionHandling;

public class TryCatchFinally {

	public static void main(String[] args) {
		try {
			
			//risky code
			int a=100, b=0, c;
			c=a/b;
		} catch (Exception e) {
	//handling code
			e.printStackTrace();
		}
		
		finally {
			System.out.println("No matter what I will be printed");
			//cleanup code
			//database closure connections
			//file closing code
			//memory release code
			//log release code
		}

	}

}
