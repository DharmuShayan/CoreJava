package executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemoWithRunnable {

	public static void main(String[] args) {

		PrintJob[] job = { new PrintJob("Dharmu"), 
				new PrintJob("Chandan"), 
				new PrintJob("Kundan"),
				new PrintJob("Raaz"), 
				new PrintJob("Simran"), 
				new PrintJob("Sima") };
		
		ExecutorService service = Executors.newFixedThreadPool(4);
		
		for (PrintJob printJob : job) {
			service.submit(printJob);
			
		}
		service.shutdown();
		//service.shutdownNow();
	}

}

class PrintJob implements Runnable {

	String name;

	PrintJob(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		
		System.out.println(name + "Job started by Thread" + Thread.currentThread().getName());
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(name + "Job complited by Thread" + Thread.currentThread().getName());
	}
}