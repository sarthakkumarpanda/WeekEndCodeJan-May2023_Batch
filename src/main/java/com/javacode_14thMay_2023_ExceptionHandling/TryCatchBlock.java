package com.javacode_14thMay_2023_ExceptionHandling;

public class TryCatchBlock {

	public static void main(String[] args) {
		
		
			try {
				int a=100, b=0, c;
				c = a/b;
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("Hello World");
		
			try {
				example();
			} catch (Exception e) {
				e.printStackTrace();
			}

	}
	
	public static void example() {
		
			String name = null;
			System.out.println(name.length());
		
		}
	}
	
	//How is code handled in the Catch Block?
	/*Whenever there is an Exception, the method in which Exception occurs will create an Object
	 * This object will store 3 things - exceptionName (the classNameException)
	 *                                 - description of the exception (e.g., divide by zero)
	 *                                 - stack trace
	 * 
	 * in this example can main method handle the exception ?? Answer is NO
	 * this object will be passed to JVM
	 * if jvm choses not to handle the exception then it will abruptly terminate the program and control
	 * will be passed to DefaultExceptionHandler and it will DEH will print the program
	 */



