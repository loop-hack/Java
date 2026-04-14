package oop_lec;

public class Box_price extends Box_weight {
	
	
	double price;
	
	Box_price(double l, double w, double h, double weight,double p){
		
		super(l,h,w,weight);
		
		this.price = p;
		
	}
	
	

}
