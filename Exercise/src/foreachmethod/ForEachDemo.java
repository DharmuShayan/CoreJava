package foreachmethod;

import java.util.Arrays;
import java.util.List;


import WithLambda.Employee;

public class ForEachDemo {

	public static void main(String[] args) {
	
		List<Employee> emp= Arrays.asList(
				 new Employee("Dharmu","Shayan",24),
				 new Employee("Chandan","Kumar",10),
				 new Employee("Vijay","Kumar",15),
				 new Employee("Robin","Kumar",10)
				);
		
		for (Employee employee : emp) {
			System.out.println(employee);
		}
		
		//emp.forEach(e->System.out.println(e));
		
		emp.forEach(System.out::println);

	}

}
