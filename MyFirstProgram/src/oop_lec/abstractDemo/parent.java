package oop_lec.abstractDemo;

public abstract class parent {
	
	// We can also have a variable in abstract class
	
	String name;
	
	
	// Let's create a constructor in parent class and use in child class
	
	int age;
	
	public parent(int age) { // Constructor
		this.age = age;
	}
	
	abstract void career(String name);
	
	abstract void partner(String name, int age);

}
