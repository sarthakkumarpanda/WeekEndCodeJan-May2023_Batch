package java_oops_15thApr_2023;

//100% abstraction
//all the variables inside the interface are public, static and final in nature

//what is an interface ?
//as blueprint of a class
//it specifies the methods that a class should implement
//but it does not provide any implementation details of those methods

//interface tells a Class what to do but does not tell how to do
//the implementation details of the methods are left to the implementing Class

public interface Execute {
	
	public static final int i = 10;
	
	public void secret();
	
	//all non static methods can be created using default keyword 
	
	default void world() {
		
	}
	
	public static void green() {
		
	}
	
	
	/*
	 * private static void game() {
	 * 
	 * }
	 */
	
	
	

}
