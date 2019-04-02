package processHandler;

import java.time.Duration;
import java.time.Instant;
import java.util.stream.Stream;

public class ProcessHandlerDemo3 {

	public static void displayProcessInfo(ProcessHandle process) {
		ProcessHandle.Info info = process.info();

		System.out.println(process.pid());
		System.out.println(info.user().orElse(""));
		System.out.println(info.command().orElse(""));
		System.out.println(info.startInstant().orElse(Instant.now()));
		System.out.println(info.totalCpuDuration().orElse(Duration.ofMillis(0)).toMillis());
	}

	public static void main(String[] args) throws InterruptedException {
		Stream<ProcessHandle> allProcess = ProcessHandle.allProcesses();
		allProcess.forEach(process -> displayProcessInfo(process));
	}
}
