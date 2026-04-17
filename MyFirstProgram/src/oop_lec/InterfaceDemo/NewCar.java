package oop_lec.InterfaceDemo;

public class NewCar {
	
	private Engine engine;  // Here we have declared the object not initiated it
	
	private Media player = new CDplayer();
	
	
	public NewCar() {
		engine = new PowerEngine(); // here we have created engine using PowerEngine class
	}
	
	public NewCar(Engine engine) {
		this.engine = engine;
	}
	
	public void start() {
		engine.start();
	}
	
	public void stop() {
		engine.stop();
	}
	
	public void StartMusic() {
		player.start();
	}
	
	public void StopMusic() {
		player.stop();
	}
	
	
}
