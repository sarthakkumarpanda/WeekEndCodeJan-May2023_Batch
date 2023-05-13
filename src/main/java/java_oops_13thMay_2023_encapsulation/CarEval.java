package java_oops_13thMay_2023_encapsulation;

public class CarEval {

	public static void main(String[] args) {
		Car car = new Car("Honda", "Accord", 2023);
		
		System.out.println(car.getMake());
		System.out.println(car.getModel());
		System.out.println(car.getYear());
		

	}

}
