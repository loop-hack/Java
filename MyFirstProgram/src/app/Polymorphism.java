package app;

public class Polymorphism {
	static class Animal{
		void sound() {
			System.out.println("Animal make a sound ");
		}
	}
	static class dog extends Animal{
		void sound() {
			System.out.println("Dog barks");
		}
	}
	static class cat extends Animal{
		void sound() {
			System.out.println("cat meows");
		}
	}
	public static void main(String[] args) {
		Animal a;
		a = new dog();
		a.sound();
		a = new cat();
		a.sound();
		
	}
	

}
