package ProcessAPI;

import java.io.IOException;

public class ProcessClass {

	public static void main(String[] args) throws IOException {

		ProcessHandle handle = ProcessHandle.current();
		ProcessHandle.Info info = handle.info();
		System.out.println(info);
		System.out.println(info.user().get());
		System.out.println(info.command().get());
		System.out.println(info.startInstant().get());
		System.out.println(info.totalCpuDuration().get());
		
	}

}
