package app;

import java.util.Scanner;

public class Swap {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String x = "water";
		String y = "Kool-Aid";
		String temp = null; // OR we could have done String temporary_variable; its same thing
		
		
		System.out.println("Intially x: " + x);
		System.out.println("Intially y: " + y + "\n");
		
		temp = x;
		x = y;
		y = temp;
		
		System.out.println("After Swap x: " + x);
		System.out.println("After Swap y: " + y);
		
		System.out.println("New code is : ");
		
		System.out.println("What is your name ? ");
		
		String name = scanner.nextLine();
		
		System.out.println("What is your age ? ");
		
		int age = scanner.nextInt();
		
		System.out.println("what is Your Favourite food ? ");
		
//		String food = scanner.nextLine(); This is creating error because of the nature of scanner and nextLine()
//		Fix would be use nextLine();
		
		scanner.nextLine(); // resets scanner 
		
		String food = scanner.nextLine();
		
		System.out.println("Hello " + name);
		System.out.println("You are " + age +" years old." );
		System.out.println("You like " + food + ".");
	}
}
