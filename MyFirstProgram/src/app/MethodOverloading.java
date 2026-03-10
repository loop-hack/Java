package app;

public class MethodOverloading {
	static class MathOperation{
		int add(int a, int b) {
			return a+b;
		}
		
		int add(int a, int b, int c) {
			return a + b + c;
		}
	}
	
	public static void main(String[] args) {
		MathOperation m = new MathOperation();
		System.out.println(m.add(2, 3,4));
		System.out.println(m.add(2, 3));
	}

}
