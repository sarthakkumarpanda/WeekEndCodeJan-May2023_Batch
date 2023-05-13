package special_Classes_In_Java_13thMay_2023;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Understanding_Casting {
	
	public static WebDriver driver;

	//Casting in Java is the process of converting a value from one data type to another
	
	//Casting in Java is like taking an object of one shape and making it to fit into a differently shaped container.
	
	//Jug of water. Pour this water into a Cup.
	//if cup is too small - water will pour out
	//if cup is too big - it will not fill up completely. 
	
	//There are 2 types of casting in java
	//1. Widening Casting(Implicit)
	//Example: pouring water from a smaller jug into a larger jug. Nothing will be lost in the process. 
	//In Java, this is done automatically.
	//Example: we have an int value and we want to store it in a long variable. We as developers do not need to cast
	//What will Java do - it will widen the int to long
	
	//2. Narrowing Casting(explicit)
	//
	
	//Casting can be used to convert between incompatible data types
	
	public static void main(String[] args) {
		
	
	int num = 1;
	long num1 = num; //num(is an int) is automatically widened to a long
	
	double dum = 1.2345;
	int dum1 = (int) dum; //dum is explicitly narrowed to int
	
	//incompatible casting
	String S1 = "100";
	int numval = Integer.parseInt(S1); 
	
	char ch = 'a';
	int numChar = (int) ch;
	
	
	JavascriptExecutor js = ((JavascriptExecutor)driver); 
	
	//we use the cast operator(JavascriptExectuor) to explicitly cast the driver to a JavascriptExecutor Object
	js.executeScript("alert('Hello, world!);");
	
}
	
}
