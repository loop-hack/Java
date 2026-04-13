package oop_lec;

public class oops_lec2 {
	
	
	static int a = 5;
	static int b;
	
	// This is static block that means it wi9ll run exactly once
	
	static {
		System.out.println("Static Block running. ");
		b = a * 3;
	}
	
	
	public static void main(String[] args) {
		
		// we only need to make a object when we have class created and method is in it
		
//		test_package object = new test_package(); // first we need to make an object to use any .java file features
//		object.kill("alpha");
		
//		test_package.kill("Ankit_Anurag");
		
		Human_class hum1 = new Human_class("Ankit", 32, true, 32000);
		
		System.out.println(hum1.name);
		
		
	// As for static variable we do not need to create a object to access it 
		
		System.out.println(Human_class.population);
		
		ank();
		
		
		// we will be using static block here to verify that if its runs single time or it runs multiple time
		
		oops_lec2 staticBlock = new oops_lec2();
		
		System.out.println(staticBlock.a + " " + staticBlock.b);
		
		
		b += 116;
		
		System.out.println(staticBlock.a + " " + staticBlock.b);
		
		
		
	}
	
	
	static void ank() {   // we need to make method static in order to use in other static function
		System.out.println("Hey");
		
		// to use meet() we need to make obj 
		// Since meet() is method inside a class that is oops_lec2
		
		oops_lec2 obj1 = new oops_lec2();
		
		obj1.meet(); 
		
	}
	
	
	// We can also use non static in static for that we need to first make an obj for it
	
	void meet() {
		System.out.println("We will meet again.");
		lift();  // non static is being used in non static without needing for an object
	}
		
	
	// Let's say we have a non static function appended to another non static func 
	
	void lift() {
		System.out.println("Press The Key Nigga!!");
	}
	
	
	
}
