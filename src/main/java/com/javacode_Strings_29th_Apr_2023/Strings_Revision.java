package com.javacode_Strings_29th_Apr_2023;

public class Strings_Revision {
	
	//String is a Class
	//String Objects can be directly created
	//String Constant(Literal) Pool
	//String, StringBuffer, StringBuilder
	//Immutability Concept of String Objects
	//Final concept of String Classes
	//Difference between == operator and .equals() method
	//Why saving passwords is better in Char Array rather than Strings
	//String Operations
	
	//In interviews - Strings are very important
	//In interviews - Strings and Arrays in depth
	
	//Interview Questions
	//How to reverse a String
	//Maximum Occurring character in a String
	
	
	//Heap Memory - String Constant Pool or String Literal Pool (SCP/SLP)
	//Stack Memory
	//PC Register
	//Method Area
	//Native Method Area

	public static void main(String[] args) {
		
		//by default String Class is final in nature
		
		//String Objects
		
		String S0 = new String(); //1 object will be created in the Heap Memory
		
		String S = new String("Selenium"); //2 objects will be created - 1 in HM, 1 in SLP
		
		String S1 = "Java"; //1 object will be created and it will be stored in SLP
		
		String S2 = "Java"; //0 objects will be created
		

	}

}
