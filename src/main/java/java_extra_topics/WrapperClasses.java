package java_extra_topics;

public class WrapperClasses {
	// Wrapper classes are the classes that allow primitive data types to be used as
	// objects.
	// e.g., instead of int we can use Integer Object. Here Integer is the Wrapper
	// Class
	// Each primitive data type has it's respective Wrapper Class

	@SuppressWarnings("removal")
	public static void main(String[] args) {

		// int --> Integer
		// short --> Short
		// boolean --> Boolean
		// char --> Character
		// byte --> Byte
		// float --> Float
		// double --> Double
		// long --> Long

		// Wrapper classes have a variety of useful methods to help in coversion
		// operations
		// e.g., Integer.parseInt()- converts a String to an int
		// e.g., Boolean.valueOf() - converts a String to a boolean

		// Autoboxing: - it is automatic conversion of primitive data types into their
		// corresponding Wrapper Classes
		// e.g.,

		// Unboxing - it is the opposite of Autoboxing [converstion of Wrapper Classes
		// to corresponding primitive data types]

		int i = 10;
		Integer num = i; // Java is automatically converting primitive data type int variable to Integer
							// Object

		Integer j = Integer.valueOf(100);
		int num1 = j;

		String S1 = "123456";
		int num2 = Integer.parseInt(S1); // converts the String to int
		System.out.println(num2);

		boolean b = Boolean.valueOf("true"); // converts a String to boolean

		// Create an Integer object
		Integer k = Integer.valueOf(345);

		// How to use a method on k (reference of Integer Wrapper Class)
		int valueofint = k.intValue(); // returns the underlying int value

		// Convert a String to an Integer
		String S2 = "987654";
		Integer num3 = Integer.parseInt(S2);
		System.out.println(num3);

		// Create a Double Object
		Double d = Double.valueOf(123.456);
		double dValue = d.doubleValue(); // returns the underlying double value
		System.out.println(dValue);

		// Converting String to a Double
		String S3 = "100.99";
		Double dValueString = Double.parseDouble(S3);
		System.out.println(dValueString);

	}

}
