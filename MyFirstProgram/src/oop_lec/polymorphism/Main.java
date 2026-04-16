package oop_lec.polymorphism;

public class Main {
	
	public static void main(String[] args) {
		// creating an object from class
		
		Shapes shape = new Shapes();
		Circle circle = new Circle();
		Square square = new Square();
		Triangle triangle = new Triangle();
		
		Shapes square1 = new Square();
		
		shape.area();
		
		circle.area();
		
		square1.area();
		
	}

}
