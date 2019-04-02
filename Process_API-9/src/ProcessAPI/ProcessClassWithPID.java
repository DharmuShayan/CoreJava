package ProcessAPI;

import java.io.IOException;
import java.util.Optional;

public class ProcessClassWithPID {

	public static void main(String[] args) throws IOException {

		Optional<ProcessHandle> opt = ProcessHandle.of(1152);

		ProcessHandle handle = opt.get();
		ProcessHandle.Info info = handle.info();
		System.out.println(info);
		System.out.println(info.user().get());
		System.out.println(info.command().get());
		System.out.println(info.startInstant().get());
		System.out.println(info.totalCpuDuration().get());
	}
}
