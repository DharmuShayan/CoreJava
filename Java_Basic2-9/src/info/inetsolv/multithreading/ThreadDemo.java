package info.inetsolv.multithreading;

public class ThreadDemo {

	public static void main(String[] args) throws InterruptedException {
		
		Music mu=new Music();
		Downloading d=new Downloading();
		Movie mo=new Movie();
		
		mu.start();
		mu.join();
		
		d.start();
		d.join();
		
		mo.start();
		mo.join();
	}
}
