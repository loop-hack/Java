package app;

public class Cooking {
	static class Cook extends Thread{
		private String task;
		
		Cook(String task){
			this.task = task;
		}
		
		@Override
		public void run() {
			System.out.println(task + " is prepared by " + Thread.currentThread().getName());
		}
	}
	
	public static void main(String[] args) {
		Thread t1 = new Cook("Mojito");
		Thread t2 = new Cook("Ckicken");
		
		t1.start();
		t2.start();
	}

}
