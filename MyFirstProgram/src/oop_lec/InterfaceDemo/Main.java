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
		audi.start();  // calling engine class bcz of the way NerCar() class is defined
		audi.stop();
		audi.StartMusic(); // also using start() but here it is defined differently only for CDplayer() class
		audi.StopMusic();
		
		
		
	}

}
