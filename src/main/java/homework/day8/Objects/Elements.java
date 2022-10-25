package homework.day8.Objects;

import java.util.ArrayList;
import java.util.List;

public class Elements {

    public static void main(String[] args) {

        List<String> elements = new ArrayList<>();

        elements.add("Text field");
        elements.add("Radio");
        elements.add("Check-box");
        elements.add("Drop-down");
        elements.add("Picker");
        elements.add("Breadcrumb");

        for (String i : elements) {
            System.out.printf(i + " ");
        }
        System.out.println();

        int counter = 0;
        for (String i : elements) {
            if (i.contains(" ") || i.contains("-")) {
                counter++;
            }
        }
        System.out.println(counter + " элементов содержат в названии более 1 слова");

        for (int i = 0; i < elements.size(); i++) {
            System.out.printf(elements.get(i) + " ");
        }
        System.out.println();

        elements.add(4, "Spinner");
        elements.remove(2);
        elements.set(5, "Switch");

        for (String i : elements) {
            System.out.printf(i + " ");
        }
    }
}
