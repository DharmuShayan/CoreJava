package instance_method_from_class_type;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		Integer[] stringArray = { 12,56,89,23,-56,78,-47 };
		/*
		 * Method reference to an instance method of an arbitrary object of a particular
		 * type
		 */
		Arrays.sort(stringArray, Integer::compareTo);
		for (Integer str : stringArray) {
			System.out.println(str);
		}
		
		
		String[] stringArray1 = { "Steve", "Rick", "Aditya", "Negan", "Lucy", "Sansa", "Jon"};
		/* Method reference to an instance method of an arbitrary 
		 * object of a particular type
		 */
		Arrays.sort(stringArray1, String::compareToIgnoreCase);
		for(String str: stringArray1){
			System.out.println(str);
		}
	}

}
