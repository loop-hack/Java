package oop_lec;

public class Human_class {
	
	String name;
	int age;
	boolean married;
	int slalaries;
	static long population;  // static means this property is going to be same for each object
	
	
	public Human_class(String n, int a, boolean m, int s){
		
		this.name = n;
		this.age = a;
		this.married = m;
		this.slalaries = s;
		Human_class.population = 10;  // Human is used instead of this Since population is property of class not individual obj  
		
	}

}


