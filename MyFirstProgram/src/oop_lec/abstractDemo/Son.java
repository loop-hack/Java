package oop_lec.abstractDemo;

public class Son extends parent{
	
	// Creating a Constructor using the variable in abstract class
	
	Son(int a,String n){
		super(a);
		this.name = n;
	}
	
	@Override
	void career(String name) {
		System.out.println("I want to be " + name);
		
	}
	
	@Override
	void partner(String name, int age) {
		System.out.println("I love " + name + ". She is " + age + " years old.");
		
	}

}
