package app;

public class ConstructorOverloading {
	static class Box{
		double len, height, depth;
		
		Box(double l, double h, double d){
			len = l;
			height = h;
			depth = d;
		}
		
		Box(){
		}
		
		Box(double l){
			len = l;
		}
		
	}
	
	public static void main(String[] args) {
		Box B1 = new Box(2.0,2.0,2.0);
		Box B2 = new Box();
		Box square = new Box(5.0);
		
		System.out.println(B1.len);
		System.out.println(B2.len);
		System.out.println(square.len);
	}

}
