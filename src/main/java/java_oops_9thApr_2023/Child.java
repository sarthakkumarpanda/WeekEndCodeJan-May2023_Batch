package java_oops_9thApr_2023;

public class Child extends Parent{

	public static void main(String[] args) {
	
		Child child = new Child();
		child.bankBalance();
		child.aparment();
		child.sportsCar();
		child.Bike();
		
		Parent parent = new Parent();
		parent.aparment();
		parent.bankBalance();
		

	}
	
	
	public void sportsCar() {
		System.out.println("Child's sports car");
	}
	
	
	public void Bike() {
		System.out.println("Child's bike");
	}

}
