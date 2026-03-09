package app;

public class PracImplimentsRunnable {
	
	static class CookMeal implements Runnable{
		private String task;
		
		CookMeal(String task){
			this.task = task;
		}
		
		public void run() {
			System.out.println(task + " is prepared by " + Thread.currentThread().getName());
		}
	} 
	
	public static void main(String[] args) {
		
		Thread t1 = new Thread(new CookMeal("Burger"));
		Thread t2 = new Thread(new CookMeal("French Fries"));
		
		t1.start();
		t2.start();
	}

}
