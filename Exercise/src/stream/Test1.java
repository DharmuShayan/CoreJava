package stream;

import java.util.Optional;
import java.util.stream.Stream;

public class Test1 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
	
		Stream<Integer> numbers = Stream.of(1,2,3,4,5);
		
		System.out.println("reduce()");
		Optional<Integer> intOptional = numbers.reduce((i,j) -> {return i*j;});
		if(intOptional.isPresent()) System.out.println("Multiplication = "+intOptional.get());

		System.out.println("allMatch()");
		boolean noneMatch = numbers.noneMatch((i)->i>1);
		
	}

}
