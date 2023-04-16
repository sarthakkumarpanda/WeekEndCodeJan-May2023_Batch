package java_oops_15thApr_2023;

public class Method_Overloading {
	
	public static void main(String[] args) {
		sampleData();	
		sampleData(20);
		sampleData(10,20);
		sampleData("Hello");
		sampleData("Hello", "World");
		sampleData("Hello", 23);
		sampleData(new StringBuffer("Daily"));
		sampleData(new StringBuilder("Home"));
	}
	
	
	public static void sampleData() {
		System.out.println("This is a no parameter method");
	}
	
	public static void sampleData(int i) {
		System.out.println("This is a single int parameter method");
	}
	
	public static void sampleData(int j, int k) {
		System.out.println("This is a multiple int parameter method");
	}
	
	public static void sampleData(String S1) {
		System.out.println("This is a single String parameter method");
	}
	
	public static void sampleData(String S2, String S3) {
		System.out.println("This is a multiple String parameter method");
	}
	
	public static void sampleData(String S1, int i) {
		System.out.println("This is a multiple String and int parameter method");
	}
	
	public static void sampleData(StringBuffer S3) {
		System.out.println("This is a single StringBuffer parameter method");
	}
	
	public static void sampleData(StringBuilder S3) {
		System.out.println("This is a single StringBuilder parameter method");
	}

}
