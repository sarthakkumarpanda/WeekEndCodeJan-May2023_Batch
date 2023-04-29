package com.javacode_Strings_29th_Apr_2023;

public class WhyStringsAreImmutable {
	// Immutability concept is used for String Objects
	// String objects are immutable
	// Once String objects are created, its data or state cannot be changed

	// So basically what happens is - if we try to change the state of a String
	// Object, instead of chaging it,
	// it will create another Object

	public static void main(String[] args) {
		
        String S = new String("Apple");
        S.concat("Macbook"); //only trying to modify the object
        System.out.println(S); //AppleMacbook
        
        S = S.concat("iPhone");
        
        System.out.println(S); //here you are modifying the object as well as pointing the reference to the new object
	
	
	
	    String state1 = "Virginia";
	    String state2 = "Virginia";
	    String state3 = "Virginia";
	    
	    
	   // String state30 = "Virginia";
	    
	    String state30 = "Maryland";
	    
	    
	    
	    
	    String state50 = "Virginia";
	
	}
	
	
	

}
