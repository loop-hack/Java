package oop_lec.InterfaceDemo;

public class Car implements Engine, Break, Media{
	
	@Override
	public void start() {
		System.out.println("Starting the Engine. ");
		
	}
	
	
	@Override
	public void stop() {
		System.out.println("Stopping the engine");
		
	}
	
	@Override
	public void brake() {
		System.out.println("Applying Brake. ");
		
	}
	
	@Override
	public void acc() {
		System.out.println("Applying Accelerator. ");
		
	}

}
