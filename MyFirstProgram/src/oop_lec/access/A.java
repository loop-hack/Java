package oop_lec.access;

public class A {
	
	int num;
	String name;
	int[] arr;
	
	private String username;
		
	public A(int d, String n) {
		
		this.num = d;
		this.name = n;
		this.arr = new int[d];
		this.username = name + num;
		
	}
	
	public String getUser() {
		return username;
	}

}
