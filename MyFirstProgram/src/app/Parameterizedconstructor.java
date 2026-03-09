package app;

public class Parameterizedconstructor {
	
	static class f1Driver{
		String name;
		int position;
		String car;
		int age;
		
		f1Driver(String n, int y, String c, int p){
			name = n;
			age = y;
			car = c;
			position = p;
			
		}
	}
	
	public static void main(String[] args) {
		f1Driver D1 = new f1Driver("hemilton",32,"Ferrari",1);
		System.out.println(D1.name);
		System.out.println(D1.age);
		System.out.println(D1.car);
		System.out.println(D1.position);
	}

}
