package homework.day10;

import java.util.stream.IntStream;

public class Long {

    public static void main(String[] args) {

        IntStream longs = IntStream.rangeClosed(1, 20);

        System.out.println(longs.filter(i -> i % 2 == 0)
                .peek(System.out::println)
                .mapToDouble(i -> i * 2.54)
                .sum());
    }
}
