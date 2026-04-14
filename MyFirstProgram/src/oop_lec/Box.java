package oop_lec;

public class Box {
	
	double h;
	double l;
	double w;
	double weight;
	
	public Box(){
		this.h = -1;
		this.l = -1;
		this.w = -1;
	}
	
	// Cube 
	
	public Box(double side){
		this.h = side;
		this.l = side;
		this.w = side;
	}
	
	// Cuboid
	
	public Box(double len, double hei, double wei){
		this.l = len;
		this.h = hei;
		this.w = wei;
	}
	
	// we can pass another box obj to it
	
	public Box(Box old){  // Here we have old as previous object that I am passing
		this.h = old.h;
		this.w = old.w;
		this.l = old.l;
	}

	// We can create methods as well
	
	public void Information() {
		System.out.println("Running the box.");
	}
	
	double volume(Box obj) {
		return this.h * this.w * this.l;
	}
	
	
}
