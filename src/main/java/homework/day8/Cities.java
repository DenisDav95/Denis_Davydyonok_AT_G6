package homework.day8;

import java.util.ArrayList;
import java.util.List;

public class Cities {

    public static void main(String[] args) {

        List<String> cities = new ArrayList<>();

        cities.add("Минск");
        cities.add("Москва");
        cities.add("Берлин");

        for (String i : cities) {
            System.out.println(i);
        }

        int counter = 0;
        for (String i : cities) {
            counter += i.length();
        }
        System.out.println("Сумма всех букв в списке = " + counter);

        for (int i = 0; i < cities.size(); i++) {
            System.out.printf(cities.get(i) + " ");
        }
    }
}
