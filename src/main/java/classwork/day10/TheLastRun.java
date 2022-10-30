package classwork.day10;

import classwork.day9.Person;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TheLastRun {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("мама", "мыла", "раму", "мама", "чисто");

        List<Person> people = Arrays.asList(
                new Person("Вася", 13, Person.Sex.MAN),
                new Person("Катя", 28, Person.Sex.WOMEN),
                new Person("Вова", 24, Person.Sex.MAN),
                new Person("Маша", 38, Person.Sex.WOMEN),
                new Person("Роман Петрович", 72, Person.Sex.MAN));


        System.out.println(list.stream().collect(Collectors.joining(":", "<p>", "</p>")));

        System.out.println(people.stream().collect(Collectors.toMap(p -> p.hashCode(), p -> p)));

        people.stream().collect(Collectors.groupingBy(p -> p.sex)).keySet().forEach(System.out::println);
    }
}
