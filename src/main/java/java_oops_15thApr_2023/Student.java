package java_oops_15thApr_2023;

public class Student {

	String name; // default value is null
	int age; // default value is 0
	String subject; // default value is null

	public static void main(String[] args) {

		Student s1 = new Student("Tom", 10, "Science");
		System.out.println(s1.name + " --" + s1.age + " -- " + s1.subject);

		Student s2 = new Student("Harry", 12, "Arts");
		System.out.println(s2.name + " --" + s2.age + " -- " + s2.subject);
	}

	// in this example instance variables which are blue in color and local
	// variables which are brown are color
	// have the same name

	// this keyword - instantiates variables of the current class

	public Student(String name, int age, String subject) {
		this.name = name;
		this.age = age;
		this.subject = subject;
	}

}
