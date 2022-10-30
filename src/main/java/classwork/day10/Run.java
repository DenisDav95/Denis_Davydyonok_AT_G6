package classwork.day10;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Run {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("аааааа", "мама", "мыла","раму", "мама", "чисто");

        for (String i : list) {
            System.out.println(Arrays.asList(i.split("а")));
        }

        System.out.println(list.stream().anyMatch(x -> x.contains("мама")));
        System.out.println(list.stream().allMatch(x -> x.contains("м")));
        System.out.println(list.stream().map(x -> x.concat("м")).collect(Collectors.toList()));
        System.out.println(list.stream().flatMap(x -> Arrays.stream(x.split("а"))).collect(Collectors.toList()));
    }

}
