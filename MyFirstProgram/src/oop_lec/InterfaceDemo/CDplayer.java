package oop_lec.InterfaceDemo;

public class CDplayer implements Media{
	
	 @Override
	 public void start() {
		 
		 System.out.println("Starting Music. ");
		 
	 }
	 
	 @Override
	 public void stop() {
		 
		 System.out.println("Stopping the Music. ");
		 
	 }
	 
	 

}
