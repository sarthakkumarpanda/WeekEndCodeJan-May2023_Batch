package java_oops_15thApr_2023;

public class MainMethod_Overloaded {

	// Can I overload the main method

	public static void main(String[] args) {
		System.out.println("This is the original main method");
        main();
        main(10);
        main(args = new String[4], args = new String[5]);
	}

	public static void main() {
		System.out.println("This is a main method without any parameters");
	}
	
	public static void main(int i) {
		System.out.println("This is a main method with a single int input parameter");
	}
	
	public static void main(String[] args1, String[] args2) {
		System.out.println("This is a main method with multiple String array input parameters");
	}

}
