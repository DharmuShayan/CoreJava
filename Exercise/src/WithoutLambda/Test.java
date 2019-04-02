package WithoutLambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



public class Test {

	public static void main(String[] args) {
		
		List<Employee> emp=Arrays.asList(
				 new Employee("Dharmu","Shayan",24),
				 new Employee("Chandan","Kumar",10),
				 new Employee("Vijay","Kumar",15),
				 new Employee("Robin","Kumar",10)
				);
		
		Collections.sort(emp, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getLname().compareTo(o2.getLname());
			}});
		
		printAll(emp);
		
		printEmployeeConditionally(emp,new Condition() {

			@Override
			public boolean test(Employee e) {
			
				return e.getFname().startsWith("D");
			}
			
		});
		
				

	}

	private static void printEmployeeConditionally(List<Employee> emp,Condition condition){
		for (Employee e : emp) {
			if (condition.test(e)) {
				System.out.println(e);
			}
			
		}
	}
	
	private static void printAll(List<Employee> emp) {
		for (Employee employee : emp) {
			System.out.println(employee);
		}
		
		
	}

}



interface Condition{
	boolean test(Employee e);
}
