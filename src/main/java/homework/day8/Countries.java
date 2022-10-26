package homework.day8;

import java.util.ArrayList;
import java.util.List;

public class Countries {

    public static void main(String[] args) {

        List<String> countries = new ArrayList<>();

        countries.add("Андора");
        countries.add("Португалия");
        countries.add("Англия");
        countries.add("Замбия");

        for (String i : countries) {
            if (countries.indexOf(i) < countries.size() - 1) {
                System.out.printf(i + ", ");
            } else {
                System.out.println(i);
            }
        }

        int counter = 0;
        for (String i : countries) {
            if (i.length() < 7) {
                counter++;
            }
        }
        System.out.println(counter + " стран содержат в названии менее 7 букв");

        for (int i = 0; i < countries.size(); i++) {
            System.out.println(countries.get(i));
        }
    }
}
