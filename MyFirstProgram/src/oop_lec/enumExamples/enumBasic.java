package oop_lec.enumExamples;

public class enumBasic {
	
	enum Week {
		Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
		
		// Properties of enums
		
		// These are enum constants
		// each element in enum is public, static and final
		// since it is final you can't create a child enum
		// type is week
		
		
	}
	
	
	public static void main(String[] args) {
		
		// Using enum 
		
		Week week ;
		
		week = Week.Monday;
		
		for(Week day : Week.values()) {
			System.out.println(day);
		}
		
	}

}
