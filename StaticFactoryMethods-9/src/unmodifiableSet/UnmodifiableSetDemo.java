package unmodifiableSet;


import java.util.Set;

public class UnmodifiableSetDemo {

	public static void main(String[] args) {
		
		var unmodufiableList1 = Set.of("a","b","c","d");
		System.out.println(unmodufiableList1);
		
		
		
		Set<Integer> unmodufiableList = Set.of(10,20,56,38,78,92,91);
		unmodufiableList.forEach(System.out::println);

		System.out.println("We can not make any change");
		unmodufiableList.add(100);
		unmodufiableList.remove(56);
	
		unmodufiableList.forEach(System.out::println);//java.lang.UnsupportedOperationException
	
	      
	}

}
