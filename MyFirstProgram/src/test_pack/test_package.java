package test_pack;

public class test_package {
	
	public static void main(String[] args) {
		
		String name = "Ankit";
		
		kill(name);
	}
	
	public static void kill(String name1) {  // you must make it public so that you can use  in different packages
		System.out.println("Hey" + name1 + "I am going to kill you.");
	}

}
