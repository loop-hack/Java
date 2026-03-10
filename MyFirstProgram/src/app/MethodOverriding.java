package app;

public class MethodOverriding {
	
	static class Animal{
		void sound() {
			System.out.println("Sound of animal is ");
		}
	}
	static class cat extends Animal{
		void sound() {
			System.out.println("Cat Meows");
		}
	}
	
	public static void main(String[] args) {
		Animal a;
		a = new cat();
		a.sound();
	}

}
