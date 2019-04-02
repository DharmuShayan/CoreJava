package stream;


import java.util.Arrays;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {
		List<Student> stu =Arrays.asList(
				new Student("Dharmu", "Shayan", 22),
				new Student("Dharmu", "Shayan", 24),
				new Student("Dharmu", "Shayan", 24),
				new Student("Chandan", "Kumar", 10),
				new Student("Vijay", "Kumar", 15),
				new Student("Vijay", "Kumar", 15), 
				new Student("Robin", "Kumar", 10));

		System.out.println("filter()");
		stu.stream().filter(s -> s.getLname().endsWith("r") || s.getLname().startsWith("h", 1))
				.forEach(System.out::println);

		System.out.println("forEach()");
		stu.stream().filter(s -> s.getAge() > 10).forEach(System.out::println);
		stu.stream().filter(fname -> isNotDharmu(stu, fname)).forEach(System.out::println);
		
		
		System.out.println("count()");
		long count = stu.stream().filter(s -> s.getAge() > 10).count();
		System.out.println(count);
		
		System.out.println("skip()");
		Stream<Student> sorted = stu.stream().skip(stu.size()-2);
				sorted.forEach(System.out::println);
				
		System.out.println("findFirst()");
		Optional<Student> findFirst = stu.stream().findFirst();
		System.out.println(findFirst.get());
		
		System.out.println("map()");
		List<String> names = stu.stream().map(s->{return s.getLname().toUpperCase();}).collect(Collectors.toList());
		System.out.println(names);
		
		System.out.println("sequential()");
		stu.stream().sequential().forEach(System.out::println);
		
		
		System.out.println("parallel()");
		stu.stream().parallel().forEach(System.out::println);
		
		System.out.println("allMatch()");
		boolean allMatch = stu.stream().allMatch(s->s.getLname().equals("Kumar"));
		System.out.println(allMatch);
		

	}

	private static boolean isNotDharmu(List<Student> stu, Student fname) {
		return !fname.equals(stu.get(0));
	}

	
}
