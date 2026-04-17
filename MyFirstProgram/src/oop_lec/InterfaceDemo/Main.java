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
		
		
		NewCar audi = new NewCar();
		audi.start();
		audi.stop();
		audi.StartMusic();
		audi.StopMusic();
		
		
		
	}

}
