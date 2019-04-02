package function;


import java.util.function.BiPredicate;

public class BiPredicateDemo {

	
	//BiPredicate<T,U> takes 2 parameters compare it and return boolean value
	public static void main(String[] args) {
		
		 
		// System.out.println(Objects.equals(10, 10));
		toFindGreater((a,b)->a<b);

	}

	private static void toFindGreater(BiPredicate<Integer,Integer> biPredicate ) {
		System.out.println(biPredicate.test(10, 80));
		
	}

}
