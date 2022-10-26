package homework.day8;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Cars {

    public static void main(String[] args) throws IOException {

        List<String> cars = new ArrayList<>();

        cars.add("Мерс");
        cars.add("Ауди");
        cars.add("Жигуль");
        cars.add("Рено");
        cars.add("Жигуль");
        cars.add("Жигуль");
        cars.add("Ауди");

        BufferedWriter logs = new BufferedWriter(new FileWriter("cars.txt"));

        for (String i : cars) {
            logs.write("\"" + i + "\"");
            logs.newLine();
        }
        logs.close();

        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).length() > 4) {
                cars.remove(i);
                i--;
            }
        }

        for (String i : cars) {
            System.out.printf(i + " ");
        }
    }
}
