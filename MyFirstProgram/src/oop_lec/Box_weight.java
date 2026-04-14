package oop_lec;

public class Box_weight extends Box{

	// This is the child class of Base class Box
	
	double weight; // This is the new property that I added 
	
	Box_weight(){
		this.weight = -1; 
	}
	
	Box_weight(double l, double w, double h, double weight){
		super(l,w,h);  // What this is doing is it is calling parent class and initializing its values
		
		// We can also access super/parent class variables using super keyword
		
		super.h = h; // Here you can see that it is accessing parent class property
		
		this.h = h; // this keyword can also be used instead of super 
		
		// why we are using super keyword to access when we use this keyword too ????
		
		// what is we have same variable name in both super and child class , how can we access it seperately
		// We do that using super to access super class variable and this for current class variable
		
		super.weight = weight; // This is accessing parent weight variable
		
		this.weight = weight; // This is accessing child weight variable
		
		
		this.weight = -1; 
	}
	
	
	
	
}
