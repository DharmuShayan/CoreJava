package info.inetsolv.multithreading;

public class Downloading extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			
			System.out.println("Downloading...");
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
