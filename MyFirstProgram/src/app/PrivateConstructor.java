package app;

public class PrivateConstructor {
	static class Example{
		String name;
		
		private Example() {
			name = "example1";
		}
	}
	
	public static void main(String[] args) {
		Example ex1 = new Example();
		System.out.println(ex1.name);
	}

}
