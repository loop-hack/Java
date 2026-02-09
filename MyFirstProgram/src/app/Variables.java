package app;

public class Variables {
	public static void main(String[] args) {
		
		int x = 23; //It can only store numbers between -2 to +2 billion for larger number use Long
		
		long y = 1788444444478490127L; //always use L in last of value stored in long
		
		byte z = 123; //byte Ranges between -128 to 127
		
		double t = 127.1234567908590;
		
		System.out.println(z);
		System.out.println(t);
		System.out.println(y);
		System.out.println(x);
		System.out.println("My age is: " + x);
	}
}
