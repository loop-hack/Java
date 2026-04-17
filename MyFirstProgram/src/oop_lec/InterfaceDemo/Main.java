package oop_lec.InterfaceDemo;

public class Main {
	
	public static void main(String[] args) {
		
		Car ferrari = new Car();
		ferrari.start();
		ferrari.stop();
		ferrari.acc();
		ferrari.brake();
		
		
		Media carMedia = new Car();
		carMedia.stop();
		
	}

}
