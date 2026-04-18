package oop_lec.exceptionHandling;

public class expDemo {
	
	public static void main(String[] args) {
		
		int a = 7;
		int b = 0;
		
		
//		try {
//			int c = a/b;
//		}
		
		try {
			divide(a,b);
		}
		
		catch (Exception e) {
		System.out.println(e.getMessage());  //.getMessage() provides the message
	}
		
		finally {
			System.out.println("This will always run.");
		}
		
	}
	
	
	// defining a method for division
	
	static int divide(int a, int b) throws ArithmeticException{ // throws is defining that it may throw ArithmeticException
		
		if (b == 0) {
			throw new ArithmeticException("Please do not divide by zero"); // we are using throw to throw exception
		}
		
		return a/b;
	}
	

}
