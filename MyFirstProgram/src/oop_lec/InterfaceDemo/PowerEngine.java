package oop_lec.InterfaceDemo;

public class PowerEngine implements Engine {
	
	@Override
	public void start() {
		System.out.println("Starting the Engine. ");
	}
	
	@Override
	public void stop() {
		System.out.println("Stopping the Engine. ");
	}
	
	@Override
	public void acc() {
		System.out.println("Accelerating. ");
	}

}
