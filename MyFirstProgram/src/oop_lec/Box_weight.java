package oop_lec;

public class Box_weight extends Box{

	// This is the child class of Base class Box
	
	double weight; // This is the new property that I added 
	
	Box_weight(){
		this.weight = -1; 
	}
	
	Box_weight(double l, double w, double h, double weight){
		super(l,w,h);  // What this is doing is it is calling parent class and initializing its values
		this.weight = -1; 
	}
	
	
	
	
}
