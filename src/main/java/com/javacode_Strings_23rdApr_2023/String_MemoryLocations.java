package com.javacode_Strings_23rdApr_2023;

public class String_MemoryLocations {
	//Heap Memory - String Constant Pool or String Literal Pool (SCP/SLP)
	//Stack Memory
	//PC Register
	//Method Area
	//Native Method Area
	
	//Whenever you create an Object using new keyword, the object is stored in the Heap Memory

	public static void main(String[] args) {
		
		String S1 = new String();
		
		String S2 = new String("Java"); //Literal gets stored in SLP/SCP area
		//2 objects will get created. 1 due to new keyword and another 1 due to literal passed
		 
		String S3 = new String("Python");	
		
		String S4 = new String("C++");
		
		String S5 = "Java"; // no object will be created in this

	}

}
