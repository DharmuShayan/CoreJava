package classInstance_instanceMethodName;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ClassInstanceReferToinstanceMethodName {

	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(1,12,433,5);
		//Refer to an instance method using a reference to the supplied object
		Optional<Integer> max = integers.stream().reduce( Math::max );
		 
		max.ifPresent( System.out::println );

	}

}
