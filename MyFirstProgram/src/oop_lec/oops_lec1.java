package oop_lec;

public class oops_lec1 {
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		

		
		
		// Creating a data structure containing aLL INFO
		
		class Student {
			int rolln;
			String names;
			float marks;
			
			// creating A constructor
			
			// By default constructor has by default value of each data type
			
			// This is no Argument Constructor
			
			Student(){
				this.rolln = 48;
				this.names = "Ankit_Anurag";
				this.marks = 75.4f;
				
			}
			
			// Argument Constructor
			
			Student(int roll_number,String name_of_student,float marks_obtained){
				this.rolln = roll_number;
				this.names = name_of_student;
				this.marks = marks_obtained;
			}
			
			// constructor that takes in some object and create an object using it
			
			Student(Student other){
				this.rolln = other.rolln;  // here this will be replaced by random and other by student2
				this.names = other.names;
				this.marks = other.marks;
			}
			
			
			// creating a constructor that call another constructor
			
			Student(int roll_number, String name_of_student){
				this (roll_number, name_of_student, 0.0f);
			}
			
			// Creating a method in class
			
			void greeting() {
				System.out.println("Hi my name is : " + this.names);
			}
			
			
		}
		
		// store 5 roll numbers
		
		int[] number = new int[5];
		
		//store 5 names 
		
		String[] name = new String[5];
		
		// store data of   students : 
		
		Student[] students = new Student[5];
		
		Student student1 = new Student();
		
		System.out.println(student1);
		
		System.out.println(student1.rolln);
		
		System.out.println(student1.names);
		
		System.out.println(student1.marks);
		
		// Now we will be assigning values to student1 
		
		student1.rolln = 48;
		student1.names = "Ankit";
		student1.marks = 8.3f; // by default java see decimal value as double, so to use float we need to put 2.3f instead of 2.3
		
		System.out.println(student1.names);
		System.out.println(student1.rolln + "" + student1.marks);
	
	
			
	
			Student student2 = new Student();
			
			System.out.println("\n-------01------\n" + student2.rolln + "\n" + student2.names + "\n" + student2.marks);
			
			// Constructing new object by using argument class constructor
			
			Student student3 = new Student(32, "Ram", 87.4f);
			
			System.out.println("\n-----02-----\n"+student3.rolln + "\n" + student3.names + "\n" + student3.marks);
			
			
			// creating an object and passing values from the other object
			
			Student random = new Student(student2);
			
			System.out.println("\n------03------\n" + random.rolln + "\n" + random.names + "\n" + random.marks);

			// using constructor that calls another constructor
			
			Student random2 = new Student(32,"Alpha");
			
			System.out.println("\n----04-----\n" + random2.rolln + "\n" + random2.names + "\n" + random2.marks);
			
			
			// Calling a method created in class
			
			student2.greeting();
			
			
			// Assigning value of one object to another; means both are pointing to the same object
			
			
			Student two = random2;
			
			two.names = "Virat";
			
			System.out.println(random2.names); // here changes made by two will be seen in random2
			
			// Using Final keyword
			
//			final int x = 10;
//			
//			x = 25;  // we cannot do this , it will show error that we can't change value of final variable
//			
//			System.out.println(x);
			
			
			// Let's convert primitive data type into class
			
			Integer a = 10;
			Integer b = 20;
			
			swap(a,b);
			
			System.out.println(a + "" + b);  // outpout 10 20 , NO SWAPPING !!! BECAUSE INTEGER IS FINAL CLASS
			
			
			// NOTE : final IS IMMUTABLE ONLY FOR PRIMITIVE DATA TYPE; YOU CAN CHNAGE VALUE OF NON-PRIMITIVE DATA TYPE
			
			final Student stud3 = new Student(21, "Conon", 96.7f);
			
			stud3.names = "McGregor";
			
			System.out.println(stud3.names);
			
			// stud3 = new Student(21);  We cannot redefine/reassign the object when it is used with final
			


	}
		
	
		// function for swapping
		
		static void swap(Integer a , Integer b) {
			Integer temp = a;
			a = b;
			b = temp;
		}
		
		
		@Override  
		protected void finalize() throws Throwable {  
		System.out.println("GC cleaning up...");  
		}  
		
	
}
