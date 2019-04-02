package info.inetsolv.multithreading;

public class Movie extends Thread {

	public void run() {
		for (int i = 0; i < 10; i++) {
			
			System.out.println("Movie is playing");
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
