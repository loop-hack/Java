package oop_lec.abstractDemo;

public class Daughter extends parent{
	
	@Override
	void career(String name) {
		System.out.println("I want to be " + name);
		
	}
	
	@Override
	void partner(String name, int age) {
		System.out.println("I love " + name + ". He is " + age);
	}

}
