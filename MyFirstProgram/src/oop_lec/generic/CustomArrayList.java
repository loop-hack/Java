package oop_lec.generic;

import java.util.ArrayList;

public class CustomArrayList {
	
	public static void main(String[] args) {
		ArrayList <Integer> list = new ArrayList <>();  //This is how we define an array list in java
		
		list.add(1);
		list.add(2);
		list.add(3);
		
		System.out.println(list);
		
		list.remove(0);
		
		System.out.println(list);
		
		System.out.println(list.get(0));
		list.set(1, 2428);
		
		System.out.println(list);
		
		System.out.println(list.size());
		
		System.out.println(list.isEmpty());
		
	}

}
