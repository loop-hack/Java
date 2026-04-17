package oop_lec.abstractDemo;

public class Daughter extends parent{
	
	
	//Creating a Constructor using variable in abstract class
	
	Daughter(int a,String n){
		super(a);   // Here we are not using constructor of parent class extend of parent is using it 
		this.name = n;
		
	}
	
	@Override
	void career(String name) {
		System.out.println("I want to be " + name);
		
	}
	
	@Override
	void partner(String name, int age) {
		System.out.println("I love " + name + ". He is " + age);
	}

}
