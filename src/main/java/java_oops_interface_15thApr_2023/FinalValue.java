package java_oops_interface_15thApr_2023;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class FinalValue extends Demo implements Execute, Execute_New{
	
	//a Class can extend another Class
	//a Class can implement an interface
	//a Class can implement multiple interfaces
	//a Class can extend another class and implement multiple interfaces

	public static void main(String[] args) {
		//Here FinalValue is known as the implementing class
		//it is the responsibility of the implementing Class to invoke the unimplemented methods
		// of the abstract Class it extends and interfaces it implements
		
		//Can I create the object of an interface ?
		//Answer is NO
		
		WebDriver driver = new ChromeDriver();
		
		//ChromeDriver is the implementing class
		
		//Can an abstract class implement an interface ??

	}

	@Override
	public void hello() {
		
		
	}

	@Override
	public void world() {
		
		
	}

	@Override
	public void sky() {
		
		
	}

	@Override
	public void chase() {
		
		
	}

	@Override
	public void run() {
		
		
	}

	@Override
	public void dance() {
		
		
	}

	@Override
	public void walk() {
		
		
	}

}
