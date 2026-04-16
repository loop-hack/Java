package oop_lec.polymorphism;

public class Circle extends Shapes{
	
	@Override  // This checks if method below is overridden or not; if not then show error
	void area() {
		System.out.println("Area is pie * r * r");
	
	}
		
		
	// let's try to override final method
		
//	@Override
//	void superhero() {  // It will show error bcz we can't override superman() because it is final
//		System.out.println("Superhero Circle");
//	}
		
		
}
