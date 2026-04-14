package oop_lec;

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
		
		
		
		
	}
	

}
