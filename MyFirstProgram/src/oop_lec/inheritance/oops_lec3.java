package oop_lec.inheritance;

public class oops_lec3 {
	
	// Learning 4 main properties of oops
	// Inheritance Polymorphism Encapsulation Abstraction
	
	// Inheritance
	
	public static void main(String[] args) {
		
		
		Box box1 = new Box(34);
		
		System.out.println(box1.l);
		
		// Child class
		
		Box_weight child1 = new Box_weight(23,33,2,1); // Anything that is private can't be used even in child
		System.out.println(child1.h + " " + child1.weight);
		
//		Box box5 = new Box_weight(1,2,3,4);
		
//		System.out.println(box5.weight);  // This will show error bcz box5 is Box type data set which doesn't have weight in it
		
		
		// you can't have child reference and create a object using parent initialization
		// because parents doesn't have permission to initialize child variables
		// That means you can't do this 
		
//		Box box4 = new Box_weight(1,2,3);  This isn't allowed
		
		
		
	}
	

}
