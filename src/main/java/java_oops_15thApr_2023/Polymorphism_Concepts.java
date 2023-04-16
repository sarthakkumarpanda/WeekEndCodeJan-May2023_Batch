package java_oops_15thApr_2023;
//poly means multiples
//morph - different forms
public class Polymorphism_Concepts {
	
	//Types: -
	
	//Compile Time Polymorphism [static polymorphism]
	
	//How to achieve?
	//1. Method overloading
	//2. Method name should be same. Class should be same. Parameters or arguments will be different
	//3. Handled by the compiler
	//4. HAS-A Relationship
	
	
	//Run Time Polymorphism [dynamic polymorphism]
	
	//How to achieve?
	//1. Inheritance
	//2. Method name should be same. Class obviously different. Para or Args same
	//3. IS-A Relationship
	//4. Access modifier of child class overriden method should have higher or equivalent
	//   access compared to Parent class method
	
	
	//public > default > protected > private
	
	//Parent method is public then the child has to be public
	//Parent method is protected then the child can also have both protected or public

}
