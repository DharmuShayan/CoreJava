package info.inetsolv.multithreading;

public class Music extends Thread {

	public void run() {
		for (int i = 0; i < 10; i++) {
			
			System.out.println("Music is playing");
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	
}
