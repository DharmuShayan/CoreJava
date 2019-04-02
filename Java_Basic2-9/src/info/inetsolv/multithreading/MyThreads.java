package info.inetsolv.multithreading;

public class MyThreads {

	public static void main(String[] args) {

		Music m=new Music();
		Movie mo=new Movie();
		Downloading d=new Downloading();
		
		m.setPriority(8);
		mo.setPriority(7);
		d.setPriority(6);
		
		m.start();
		mo.start();
		d.start();
	
	
	}

}
