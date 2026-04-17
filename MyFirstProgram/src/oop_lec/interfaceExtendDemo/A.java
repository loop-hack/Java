package oop_lec.interfaceExtendDemo;

public interface A {
	
	// Static methods in interface must have a body bcz static is not overridden later
	
	static void Kill() {
		System.out.println("I'll Kill you.");
	}
	
	
	void fun();

}
