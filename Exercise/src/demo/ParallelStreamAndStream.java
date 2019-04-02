package demo;

import java.util.ArrayList;
import java.util.List;

public class ParallelStreamAndStream {
    public static void main(String... args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 80; i++) {
            list.add(i);
        }
        //list.stream().forEach(System.out::println);
        list.parallelStream().forEach(System.out::println);
    }
}