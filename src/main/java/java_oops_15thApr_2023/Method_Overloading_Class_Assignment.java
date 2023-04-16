package java_oops_15thApr_2023;

public class Method_Overloading_Class_Assignment {

	public static void main(String[] args) {
		test();
		test(10);
		
		Method_Overloading_Class_Assignment objref = new Method_Overloading_Class_Assignment();
		objref.sample();
		objref.sample("Hello");

	}
	
	public static void test() {
		System.out.println("This is a static no parameter test method");
	}
	
	public static void test(int i) {
		System.out.println("This is a static one int input parameter test method");	
	}
	
	
	public void sample() {
		System.out.println("This is a non-static no parameter sample method");	
	}
	
	public void sample(String S1) {
		System.out.println("This is a non-static one String input parameter sample method");		
	}

}
