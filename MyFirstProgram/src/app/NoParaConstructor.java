package app;

public class NoParaConstructor {
	
	static class Dog{
		String name;
		int age;
		
		public Dog() {
			name = "tommy";
		}
	}
	
	public static void main(String[] args) {
		Dog d1 = new Dog();
		System.out.println(d1.name);
		System.out.println(d1.age);
	}

}
