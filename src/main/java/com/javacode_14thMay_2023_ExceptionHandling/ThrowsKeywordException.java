package com.javacode_14thMay_2023_ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsKeywordException {

	public static void main(String[] args) throws FileNotFoundException {
		
		FileGeneration();

	}
	
	public static void FileGeneration() throws FileNotFoundException {
		FileInputStream ip = new FileInputStream("C:\\Users\\sarth\\Desktop\\helloWorld.txt");
	}

	
	//throws keyword is used alongside method
	//throw keyword is used inside the method
	//throws provides an indication to the caller method that this method you are calling
	//has an exception and it is not capable of handling it. Either you handle or ask jvm to
}
