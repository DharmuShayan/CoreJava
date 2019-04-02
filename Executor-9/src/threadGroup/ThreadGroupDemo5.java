package threadGroup;

/**
 * java.lang.ThreadGroup[name=system,maxpri=10] 
 * Reference Handler---true
 * Finalizer---true 
 * Signal Dispatcher---true 
 * Attach Listener---true 
 * main---false
 * Common-Cleaner---true
 * 
 */
public class ThreadGroupDemo5 {

	public static void main(String[] args) throws InterruptedException {

		ThreadGroup system = Thread.currentThread().getThreadGroup().getParent();
		System.out.println(system);
		Thread[] t = new Thread[system.activeCount()];
		system.enumerate(t);
		for (Thread t1 : t) {
			System.out.println(t1.getName() + "---" + t1.isDaemon());
		}

	}
}
