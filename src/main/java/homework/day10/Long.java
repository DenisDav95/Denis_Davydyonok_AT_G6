package homework.day10;

import java.util.stream.IntStream;

public class Long {

    public static void main(String[] args) {

        System.out.println(IntStream.rangeClosed(0, 20).filter(i -> i % 2 == 0)
                .peek(System.out::println)
                .mapToDouble(i -> i * 2.54)
                .sum());
    }
}
