package com.javacode_30th_Apr_2023;

public class Final_Finally_Finalize {
	
	//finally is a block of code that is used in conjunction with try and catch
	//used to handle exceptions
	//finally - this block contains logic regardless exception is thrown or not this will execute

	
	//finalize() is a method
	
	int i; 
	
	public Final_Finally_Finalize(int i) {
		this.i = i;
	}
	
	
	public static void main(String[] args) {
		Final_Finally_Finalize obj = new Final_Finally_Finalize(10);
		
		
		
		
		obj = null;
		
		//Execute Garbage Collection
		System.gc();
	}
	
	public void finalize() throws Throwable {
		System.out.println(this.i);
		super.finalize();
	}

}
