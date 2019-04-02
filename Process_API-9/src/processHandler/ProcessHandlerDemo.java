package processHandler;

public class ProcessHandlerDemo {

	public static void main(String[] args) throws InterruptedException {

		ProcessHandle handle=ProcessHandle.current();
		long pid = handle.pid();
		
		System.out.println(pid);
		Thread.sleep(100000);
	}
}
