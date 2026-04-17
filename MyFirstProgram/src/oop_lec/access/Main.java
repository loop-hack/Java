package oop_lec.access;

public class Main {
	
	public static void main(String[] args) {
		
		// Creating an object
		
		A obj = new A(22,"Ankit");
		
		System.out.println(obj.arr[1]);
		
//		System.out.println(obj.username); This is throw error because username is private
		
		System.out.println(obj.getUser());
		
		
	}

}
