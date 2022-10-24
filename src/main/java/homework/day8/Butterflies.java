package homework.day8;

import java.util.ArrayList;
import java.util.List;

public class Butterflies {

    public static void main(String[] args) {

        List<String> butterflies = new ArrayList<>();

        butterflies.add("Common blue");
        butterflies.add("Swallowtail");
        butterflies.add("Aglais io");
        butterflies.add("Common blue");

        for (String i : butterflies) {
            System.out.println("\"" + i + "\"");
        }

        int counter = 0;

        for (String i : butterflies) {
            if (i.contains("o")) {
                counter++;
            }
        }
        System.out.println(counter + " бабочек содержат букву 'o' в своем названии");

        for (int i = 0; i < butterflies.size(); i++) {
            System.out.printf(butterflies.get(i) + " ");
        }
        System.out.println();

        for (String i : butterflies) {
            System.out.println(i);
        }
    }

}
