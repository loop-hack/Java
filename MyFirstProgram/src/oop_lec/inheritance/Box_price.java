package oop_lec.inheritance;

public class Box_price extends Box_weight {
	
	
	double price;
	
	Box_price(){
		
		super();
		
		this.price = -1;
		
	}
	
	Box_price(Box_price others){
		
		super(others);
		
		this.price = others.price;
	}
	
	Box_price(double l, double w, double h, double weight,double p){
		
		super(l,w,h,weight); 

		this.price = p; 
	}
	
	

}
