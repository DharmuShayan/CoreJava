package function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {

		List<Integer> integerList = Arrays.asList(1, 20, 40, 70, 90, 43);
		printList(integerList, i -> System.out.println(i));
	}

	public static void printList(List<Integer> listOfIntegers, Consumer<Integer> consumer) {
		for (Integer integer : listOfIntegers) {
			consumer.accept(integer);
		}
	}
}
