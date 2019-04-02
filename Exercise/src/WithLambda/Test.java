package WithLambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Test {

	
private static void printConditionally(List<Employee> emp, Predicate<Employee> predicate) {
		
		for (Employee employee : emp) {
			if (predicate.test(employee)) {
				System.out.println(employee);
			}
		}
}

	public static void main(String[] args) {
		
	List<Employee> emp = new ArrayList<>(Arrays.asList(
			 new Employee("Dharmu","Shayan",24),
			 new Employee("Chandan","Kumar",10),
			 new Employee("Vijay","Kumar",15),
			 new Employee("Robin","Kumar",10)
			));


	Collections.sort(emp,(e1,e2)-> e1.getLname().compareTo(e2.getLname()));
	
	System.out.println("All Employee");
	
	printConditionally(emp,e->true);
	
	System.out.println("All Employee whose last name Start with K"); 
	
	printConditionally(emp,e->e.getLname().startsWith("k"));
	
	System.out.println("All Employee whose First name Start with D");
	
	printConditionally(emp,e->e.getFname().startsWith("D"));
		
	}
}


