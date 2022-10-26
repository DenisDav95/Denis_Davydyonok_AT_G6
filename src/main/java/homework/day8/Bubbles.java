package homework.day8;

import homework.day8.Objects.Bubble;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bubbles {

    public static void main(String[] args) {

        List<Bubble> bubbles = new ArrayList<>(Arrays.asList(new Bubble(2, "CO2"), new Bubble(4, "O2"), new Bubble(5, "CO")));

        for (Bubble i : bubbles) {
            System.out.printf(i.getVolume() + " ");
        }
        System.out.println();

        for (Bubble i : bubbles) {
            System.out.printf(i.getName() + " ");
        }
        System.out.println();

        int sum = 0;
        for (Bubble i : bubbles) {
            sum += i.getVolume();
        }
        System.out.println("Суммарный объем всех пузырей = " + sum);

        for (int i = 0; i < bubbles.size(); i++) {
            System.out.println(bubbles.get(i).toString());
        }
    }
}
