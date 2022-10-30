package classwork.day10;

import classwork.day9.Person;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class NewRun {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("мама", "мыла", "раму", "мама", "чисто");

        List<Person> people = Arrays.asList(
                new Person("Вася", 13, Person.Sex.MAN),
                new Person("Катя", 28, Person.Sex.WOMEN),
                new Person("Вова", 24, Person.Sex.MAN),
                new Person("Маша", 38, Person.Sex.WOMEN),
                new Person("Роман Петрович", 72, Person.Sex.MAN));

        System.out.println("Максимальное значение среди букв - " + list.stream().flatMap(x -> Arrays.stream(x.split(""))).peek(System.out::println).max(String::compareTo).get());

        System.out.println("Человек с минимальным возрастом - " + people.stream().min(Comparator.comparingInt(p1 -> p1.age)).get());

        System.out.println(list.stream().map(String::length).reduce(Integer::sum).get());

        System.out.println(list.stream().mapToInt(i -> i.length() % 2 != 0 ? i.length() : 0).sum());

    }
}
