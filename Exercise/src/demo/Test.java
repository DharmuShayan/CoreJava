package demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SuppressWarnings("unused")
public class Test {
	public static void main(String...strings ) {
	
		List<Integer> ss = Arrays.asList(1,2,2,4,5,6,4,8,9,10,11,12,13,14,15);
		List<Integer> result = new ArrayList<Integer>();
		 
		Stream<Integer> stream = ss.parallelStream();
		 
		stream.map(s -> {
		        synchronized (result) {
		          if (result.size()<10) {
		            result.add(s);
		          }
		        }
				return s;
		    }).forEach( e -> {});
		 System.out.println(result); 
	    //-------------------------------------
		 System.out.println("findFirst()");
		 Stream<String> names4 = Stream.of("Pankaj","Dharmu","Amit","David", "Lisa");
		 Optional<String> firstNameWithD = names4.filter(i -> i.startsWith("h",1)).findFirst();
		 if(firstNameWithD.isPresent()){
		 	System.out.println("First Name starting with D="+firstNameWithD.get()); 
		 	
		 	//-------------------------------------
		 	
		 	System.out.println("Find Duplicate Value---");
		 	ss.stream().filter(i -> Collections.frequency(ss, i) >1)
		 	.collect(Collectors.toSet()).forEach(System.out::println);
		 	
		 	
		 	
		 	
		 	
		 	
		 }
		 
	}

}
