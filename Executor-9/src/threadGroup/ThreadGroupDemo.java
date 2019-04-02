package threadGroup;

public class ThreadGroupDemo {

	public static void main(String[] args) {
		
		System.out.println(Thread.activeCount());//1
		
		System.out.println(Thread.currentThread().getThreadGroup().activeGroupCount());
		System.out.println("ThreadGroup:");
		System.out.println(Thread.currentThread().getThreadGroup().getName());//main
		
		System.out.println("Parent of Current ThreadGroup:");
		System.out.println(Thread.currentThread().getThreadGroup().getParent());
		//java.lang.ThreadGroup[name=system,maxpri=10]
		
	
	}

}
