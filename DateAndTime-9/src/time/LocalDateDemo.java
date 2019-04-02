package time;


import java.time.Clock;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;


public class LocalDateDemo {
	public static void main(String[] args) {
		
		System.out.println("now()");
		LocalDate now = LocalDate.now();
		System.out.println(now);
		
		System.out.println("now()");
		LocalDateTime datetime = LocalDateTime.now();
		System.out.println(datetime);
		
		System.out.println("now()");
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		
		System.out.println("now(ZoneId)");
		LocalDate l = LocalDate.now(ZoneId.of("Asia/Calcutta"));
		System.out.println(l);
		
		System.out.println("ofYearDay()");
		LocalDate l1 = LocalDate.ofYearDay(2018, 1);
		System.out.println(l1);
		
		System.out.println("ofYearMonth()");
		LocalDate l2 = LocalDate.of(2018, 01, 22);
		System.out.println(l2);
		
		System.out.println("now()");
		Clock c = Clock.systemUTC();  
	    Duration d = Duration.ofHours(5);  
	    Clock clock = Clock.offset(c, d);    
	    System.out.println(clock.instant());  
	}

	
}
