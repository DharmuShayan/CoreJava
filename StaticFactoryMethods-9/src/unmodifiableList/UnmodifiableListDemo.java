package unmodifiableList;

import java.util.List;

public class UnmodifiableListDemo {

	public static void main(String[] args) {
		
		var unmodufiableList1 = List.of("a","b","c","d");
		unmodufiableList1.forEach(System.out::println);
		
		
		
		List<Integer> unmodufiableList = List.of(10,20,56,38,78,92,91);
		unmodufiableList.forEach(System.out::println);

		System.out.println("We can not make any change");
		unmodufiableList.add(100);
		unmodufiableList.remove(56);
		unmodufiableList.set(10, 40);
		unmodufiableList.forEach(System.out::println);//java.lang.UnsupportedOperationException
	
	      
	}

}
