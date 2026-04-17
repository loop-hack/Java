package oop_lec.abstractDemo;

public class Main {
	
	public static void main(String[] args) {
		
		// Creating an object from abstract class constructor is not allowed
		// That means you can't do this 
		// Parent parent1 = new Parent();
		
		
		Son obj1 = new Son(23,"Ankit");
		System.out.println("Hi, My name is " + obj1.name + ".");
		System.out.println("I am " + obj1.age + " years old.");
		obj1.career("War Loard");
		obj1.partner("Gamma", 100000);
		
		
		System.out.println("\n=================================\n");
		
		Daughter obj2 = new Daughter(24,"Hexa");
		System.out.println("Hi, My name is " + obj2.name + ".");
		System.out.println("I am " + obj2.age + " years old.");
		obj2.career("Kidnapper");
		obj2.partner("Theta", 23);
	}

}
