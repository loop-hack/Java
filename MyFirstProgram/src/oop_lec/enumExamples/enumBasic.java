package oop_lec.enumExamples;

public class enumBasic {
	
	enum Week implements Hello{  // Here it is extending Interface Hello to @Override and use its method gree()
		
		Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
		
		// Properties of enums
		
		// These are enum constants
		// each element in enum is public, static and final
		// since it is final you can't create a child enum
		// type is week
		// it cannot extend classes but can implement interfaces 
		
		@Override
		public void greet() {
			System.out.println("Hey how are you.");
		}
		
		// let's create a constructor 
		
		Week() {
			System.out.println("Constructor called for " + this);
		}
		
		// this is not public or protected, only private or default
		// why? we don't want to create new objects
		// this is not the enum concept that's why
		
		// Internally => public static final Week Monday = new Week();
		
	}
	
	
	public static void main(String[] args) {
		
		// Using enum 
		
		Week week ;
		
		week = Week.Monday;
		
		week.greet();  // using method through implementation of Interface
		
//		for(Week day : Week.values()) {
//			System.out.println(day);
//		}
		
	}

}
