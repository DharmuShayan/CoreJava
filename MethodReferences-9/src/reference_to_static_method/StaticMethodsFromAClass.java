package reference_to_static_method;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StaticMethodsFromAClass {

	public static void main(String[] args) {
	
		List<Integer> integers = Arrays.asList(-3,1,12,433,5);
        //Used to refer static methods(min) from a class(Math)
		Optional<Integer> max = integers.stream().reduce(Math::min);
		
		max.ifPresent(value -> System.out.println(value));
	}
}
