package oop_lec;

public class Singleton {
	
	private Singleton() {  // private constructor here means that we can only use it in this file
		
	}
	
	private static Singleton instance;  // Instantiating a any object
	
	public static Singleton getInstance() {  // here we have created a method to get instance/object
		
		if(instance == null) { // Checking if we already have instance created or not , if yes then do not create a new one
			instance = new Singleton();  // here object is being created 
		}
		
		return instance;  // returning the instance of that class (Singleton)
		
	}

}
