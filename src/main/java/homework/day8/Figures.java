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
        BufferedWriter logs = new BufferedWriter(new FileWriter("figures.txt"));

        for (String i : figures) {
            logs.write("-" + i);
            logs.newLine();
        }
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

        figures.add(2, "Треугольник");

        for (String i : figures) {
           System.out.printf(i + " ");
        }
    }

}
