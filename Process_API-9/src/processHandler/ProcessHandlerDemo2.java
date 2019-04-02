package processHandler;

import java.util.Optional;


public class ProcessHandlerDemo2 {

	public static void main(String[] args) throws InterruptedException {

		Optional<ProcessHandle> handle=ProcessHandle.of(10652);
		
		System.out.println(handle);
		
		ProcessHandle handle1=ProcessHandle.current();
		System.out.println(handle1);
	}
}
