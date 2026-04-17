package oop_lec.abstractDemo;

public abstract class parent {
	
	// We can also have a variable in abstract class
	
	String name;
	
	
	// Let's create a constructor in parent class and use in child class
	
	int age;
	
	public parent(int age) { // Constructor
		this.age = age;
	}
	
	
	// Adding normal methods in abstract class to use it later
	
	void Fun_Activities(String n) {
		System.out.println("I love to do " + n + " .");
	}
	
	// abstract methods
	
	abstract void career(String name);
	
	abstract void partner(String name, int age);

}
