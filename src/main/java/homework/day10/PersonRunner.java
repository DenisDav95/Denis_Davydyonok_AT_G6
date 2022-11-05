package homework.day10;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;


public class PersonRunner {

    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();

        String[] names = {"Denis", "Tim", "Kate", "Olga", "Jimme", "Sophi", "Anas", "Kim"};
        String[] surname = {"Kaval", "Dav", "Glob", "Put", "Orgon", "Samal", "Heron", "Tabas"};

        for (int i = 0; i < 100; i++) {
            people.add(new Person(names[new Random().nextInt(names.length)], surname[new Random().nextInt(surname.length)], getRandomAge(15, 31)));
        }

        System.out.println(people.stream()
                .filter(i -> i.getAge() < 21)
                .sorted(Comparator.comparing(Person::getSurname).thenComparing(Person::getName))
                .peek(System.out::println)
                .map(Person::getName)
                .collect(Collectors.toList())
                .stream().limit(4)
                .collect(Collectors.toList()));
    }

    public static int getRandomAge(int min, int max) {
        Random randomAge = new Random();
        return randomAge.nextInt(max - min) + min;
    }
}
