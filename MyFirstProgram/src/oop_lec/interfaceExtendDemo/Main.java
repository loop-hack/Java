package oop_lec.interfaceExtendDemo;

public class Main implements b{
	
	@Override
	public void fun() {
		System.out.println("Hey Have fun there. ");
	}
	
	@Override
	public void greet() {
		System.out.println("Hello Sir.");
	}
	
	
	public static void main(String[] args) {
		
		Main obj1 = new Main();
		obj1.greet();
		obj1.fun();  // fun() is not in b but it still gets called because it extends A that have fun() in it
		
	}

}
