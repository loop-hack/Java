package oop_lec.InterfaceDemo;

public class PowerEngine implements Engine {
	
	@Override
	public void start() {
		System.out.println("Starting the Power Engine. ");
	}
	
	@Override
	public void stop() {
		System.out.println("Stopping the Power Engine. ");
	}
	
	@Override
	public void acc() {
		System.out.println("Power Engine is Accelerating. ");
	}

}
