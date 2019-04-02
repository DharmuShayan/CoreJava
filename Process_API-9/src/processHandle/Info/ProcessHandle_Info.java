package processHandle.Info;

import java.time.Duration;
import java.time.Instant;
import java.util.Optional;

public class ProcessHandle_Info {

	public static void main(String[] args) {

		ProcessHandle handle = ProcessHandle.current();
		ProcessHandle.Info info = handle.info();

		System.out.println("--user()--");

		Optional<String> opt = info.user();
		System.out.println("System User Name:" + opt.get());

		System.out.println("--command()--");
		Optional<String> command = info.command();
		System.out.println("Which command is used by this program:" + command.get());

		System.out.println("-- startInstant()--");
		Optional<Instant> startInstant = info.startInstant();
		System.out.println("When it was started:" + startInstant.get());

		System.out.println("--totalCpuDuration() --");
		Optional<Duration> totalCpuDuration = info.totalCpuDuration();
		System.out.println("Total CPU duration taken by this program" + totalCpuDuration.get());

		System.out.println("-- commandLine()--");
		Optional<String> commandLine = info.commandLine();
		System.out.println("" + commandLine);
	}
}
