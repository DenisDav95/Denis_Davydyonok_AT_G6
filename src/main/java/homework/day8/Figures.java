package homework.day8;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Figures {

    public static void main(String[] args) throws IOException {

        List<String> figures = new ArrayList<>(Arrays.asList("Овал", "Прямоугольник", "Круг", "Квадрат", "Эллипс"));
        StringBuilder text = new StringBuilder();
        BufferedWriter logs = new BufferedWriter(new FileWriter("figures.txt"));

        for (String i : figures) {
            if (figures.indexOf(i) < figures.size() - 1) {
                text.append(i + "-");
            } else {
                text.append(i);
            }
        }
        logs.write(String.valueOf(text));
        logs.close();

        int counter = 0;
        for (String i : figures) {
            if ((!i.contains("и"))) {
                counter++;
            }
        }
        System.out.println(counter + " фигур не содержат в стовем названии букву 'и'");

        for (int i = 0; i < figures.size(); i++) {
            System.out.printf(figures.get(i) + " ");
        }
        System.out.println();

        figures.add(3, "Треугольник");

        for (String i : figures) {
            System.out.printf(i + " ");
        }
    }
}
