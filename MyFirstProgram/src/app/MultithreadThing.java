package app;

public class MultithreadThing {
	static class CookingTask extends Thread{
		private String dish;
		
		CookingTask(String Dish){
			this.dish = Dish;
		}
		
		@Override
		public void run() {
			System.out.println(dish + " is being prepared by " + Thread.currentThread().getName());
		}
	}
			public static void main(String[] args) {
				Thread t1 = new CookingTask("Pizza");
				Thread t2 = new CookingTask("Bread");
				
				t1.start();
				t2.start();
			
		}

}