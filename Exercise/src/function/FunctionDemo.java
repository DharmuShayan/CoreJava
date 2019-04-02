package function;

import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {

		checkOddAndEven(i -> i);

	
	}

	private static void checkOddAndEven(Function<Integer, Integer> function) {
		for (int i = 0; i < 40; i++) {
			if (i % 2 == 0) {
				System.out.println(function.apply(i));
				//System.out.println(function.apply(++i));
			}
		}

	}

}
