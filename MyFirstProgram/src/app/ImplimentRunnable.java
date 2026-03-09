package app;

public class ImplimentRunnable {
	
	static class MakeDish implements Runnable{ 
		private String task;
		MakeDish(String task){
			this.task = task;
		}
		
		public void run() {
			System.out.println(task + " is prepared by " + Thread.currentThread().getName());
		}
	}
	
	public static void main(String[] args) {
		Thread t1 = new Thread(new MakeDish("paneer"));
		Thread t2 = new Thread(new MakeDish("Mutton"));
		
		t1.start();
		t2.start();
	}

}
