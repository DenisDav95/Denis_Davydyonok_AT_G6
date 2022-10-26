package homework.day8;

import homework.day8.Objects.Person;

import java.util.ArrayList;
import java.util.List;

public class People {

    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();

        people.add(new Person(32, "Коля"));
        people.add(new Person(24, "Оля"));
        people.add(new Person(55, "Вася"));
        people.add(new Person(63, "Маша"));

        for (Person i : people) {
            System.out.printf(i.getAge() + " ");
        }
        System.out.println();

        for (Person i : people) {
            System.out.printf(i.getName() + " ");
        }
        System.out.println();

        for (int i = 0; i < people.size(); i++) {
            System.out.println(people.get(i).toString());
        }
    }
}
