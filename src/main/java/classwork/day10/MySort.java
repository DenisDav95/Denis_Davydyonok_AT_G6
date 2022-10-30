package classwork.day10;

import classwork.day9.Person;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MySort {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("аааааа", "мама", "мыла", "яраму", "мама", "чисто");

        List<Person> people = Arrays.asList(
                new Person("Вася", 13, Person.Sex.MAN),
                new Person("Катя", 28, Person.Sex.WOMEN),
                new Person("Вова", 24, Person.Sex.MAN),
                new Person("Маша", 38, Person.Sex.WOMEN),
                new Person("Роман Петрович", 72, Person.Sex.MAN));

        System.out.println(list.stream().sorted().collect(Collectors.toList()));
        System.out.println(list.stream().sorted((x, y) -> -x.compareTo(y)).distinct().collect(Collectors.toList()));

        System.out.println(people.stream()
                .sorted((p1, p2) -> {
                            if (!(p1.sex.equals(p2.sex))) {
                                return p1.sex.compareTo(p2.sex);
                            } else {
                                return p1.age - p2.age;
                            }
                        }
                ).peek(System.out::println).collect(Collectors.toList()));
    }
}
