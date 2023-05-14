package com.javacode_14thMay_2023_ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CompileTimeExceptions {

	public static void main(String[] args) {
		try {
			FileInputStream ip = new FileInputStream("C:\\Users\\sarth\\Desktop\\helloWorld.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}
	
	public static void test() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
