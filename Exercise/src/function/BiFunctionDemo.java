package function;

import java.util.function.BiFunction;

public class BiFunctionDemo {
	
	//BiFunction<T,U,R> takes 2 input return result(R)
	private static   Integer add(BiFunction<Integer, Integer, Integer> function) {
		return function.apply(10, 20);

	}

	public static void main(String[] args) {
		Integer i=add((a,b)->a+b);
		System.out.println(i);
	}

	

}
