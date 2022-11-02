package homework.day10;

import java.util.stream.Collectors;
import java.util.stream.IntStream;



public class IntList {

    public static void main(String[] args) {

        int minValue = 2;
        int maxValue = 15;

        System.out.println(IntStream.rangeClosed(minValue, maxValue).boxed().collect(Collectors.toList())
                .stream()
                .filter(i -> i % 3 == 0 || i % 5 == 0).count());
    }
}
