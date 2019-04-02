package threadGroup;

public class ThreadGroupDemo4 {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws InterruptedException {

		ThreadGroup pg = new ThreadGroup("Parent Group");
		ThreadGroup cg = new ThreadGroup(pg,"Child Group");
		
		MyThread t1 = new MyThread(pg,"Child Thread1");
		MyThread t2 = new MyThread(pg,"Child Thread2");
		
		t1.start();
		t2.start();
		
		System.out.println(pg.activeCount());//2
		System.out.println(pg.activeGroupCount());//1
		pg.list();
		Thread.sleep(10000);
		
		System.out.println(pg.activeCount());//0
		System.out.println(pg.activeGroupCount());//1
		pg.list();
	}
}

class MyThread extends Thread{
	
	public MyThread(ThreadGroup group, String name) {
		super(group, name);
		
	}


	@Override
	public void run() {
		
		System.out.println("Child Thread");
		try {
			Thread.sleep(50000);
		} catch (Exception e) {
		
		}
	}
}
