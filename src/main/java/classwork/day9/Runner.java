package classwork.day9;

import java.util.Arrays;
import java.util.List;

public class Runner {

    public static void main(String[] args) {
//        MyClass mc = new MyClass();
//        mc.justMethod(ClassX::new);

        List<Person> people = Arrays.asList(
                new Person("Вася", 13, Person.Sex.MAN),
                new Person("Катя", 28, Person.Sex.WOMEN),
                new Person("Вова", 24, Person.Sex.MAN),
                new Person("Маша", 38, Person.Sex.WOMEN),
                new Person("Роман Петрович", 72, Person.Sex.MAN));


        int counter = 0;
        for (Person i : people) {
            if (i.sex == Person.Sex.MAN && i.age > 18 && i.age < 60) {
                counter++;
            }
            if (i.sex == Person.Sex.WOMEN && i.age > 18 && i.age < 55) {
                counter++;
            }
        }
        System.out.println(counter);

        System.out.println(people.stream()
                .filter(person ->
                        ((person.age > 18)
                                && ((person.age < 60 && person.sex.equals(Person.Sex.MAN)) || (person.age < 55 && person.sex.equals(Person.Sex.WOMEN)))))
                .count());

    }
}


