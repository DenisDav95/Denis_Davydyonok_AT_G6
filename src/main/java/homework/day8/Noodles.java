package homework.day8;

import java.util.ArrayList;
import java.util.List;

public class Noodles {

    public static void main(String[] args) {

        List<String> noodles = new ArrayList<>();

        noodles.add("Hakka");
        noodles.add("Ramen");
        noodles.add("Hibachi");
        noodles.add("Schezwan");

        for (String i : noodles) {
            if (noodles.indexOf(i) < noodles.size() - 1) {
                System.out.printf(i + "-");
            } else {
                System.out.printf(i);
            }
        }
        System.out.println();

        for (int i = 0; i < noodles.size(); i++) {
            noodles.set(i, noodles.get(i).replace("a", "o"));

        }

        for (int i = 0; i < noodles.size(); i++) {
            System.out.printf(noodles.get(i) + " ");
        }
    }
}
