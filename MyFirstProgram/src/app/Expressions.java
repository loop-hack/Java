package app;

public class Expressions {
	public static void main(String[] args) {
		// Expressions are combo of operand and operator
		// Operands = values, variables, numbers, quantity
		// Operators = + - / * % *
		
		int friends = 0;
		
		friends = friends + 1;
		
		System.out.println("Number of Friends are " + friends);
		
		int car = 12;
		
		car = car/5; // here the result should be 2.4 but it will give 2 bcz we have defined it as int
		
		System.out.println(car);
		
		
		/*To solve this problem we need to convert data into double or float heres how we do that*/
		
		double pen = 12;
		pen = pen/5;
		
		System.out.println(pen);
		
	}

}
