package java_oops_13thMay_2023_encapsulation;
//Mechanism of wrapping data(variables, methods) into a single unit

//eat certain capsules [partially white, some partially blue/yellow]

//how to achieve encapsulation
//1. should know the use of access modifiers
//2. Class variables should be declared private
//3. setter and getter methods - will be declared as public [to access and modify]

//Objective - Ensure the internal state of the object is protected while still allowing
//            external code to interact with it through a well defined-interface

public class Car {
	
	private String make;
	private String model;
	private int year;
	
	
	public Car(String make, String model, int year) {
		this.make = make;
		this.model = model;
		this.year = year;
	}
	
	public String getMake() {
		return make;
	}
	
	public void setMake(String make) {
		this.make = make;
	}
	
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	

}


//in the above example. The Car class has three private variables - make, model and year
//because they have been declared private. Can you access these outside of the class ??
//we provided public getter and setter method for each of the variable.
//This will allow external code(Code from another Class) to access and modify their values in a CONTROLLED MANNER
