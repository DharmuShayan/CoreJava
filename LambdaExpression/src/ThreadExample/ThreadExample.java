package ThreadExample;

public class ThreadExample {

	public static void main(String[] args) {
		Thread innerThread = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Thread of Runnable");
			}
		});
		
		innerThread.start();
		
	
		
		Thread lambdaThread = new Thread(() ->System.out.println("Thread of lambdaThread"));
		lambdaThread.start();
	}

}
