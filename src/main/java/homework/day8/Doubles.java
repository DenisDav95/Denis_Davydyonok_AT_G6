package homework.day8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Doubles {

    public static void main(String[] args) {

        List<Double> doubles = new ArrayList<>(Arrays.asList(33.42, 34.3, 0.79, 2.3426, 6.8, 13.24, 5.5, 769.9));

        for (Double i : doubles) {
            System.out.printf(i + " ");
        }
        System.out.println();

        double multiplication = doubles.get(0);
        int i = 1;
        while (i < doubles.size()) {
            multiplication = multiplication * doubles.get(i);
            i++;
        }
        System.out.println("Произведение всех чисел массива = " + multiplication);

        double sum = 0;
        for (double j : doubles) {
            double doublePart = j % 1;
            sum += doublePart;
        }
        System.out.println("Сумма всех дробных частей чисел массива = " + sum);

        for (int j = 0; j < doubles.size(); j++) {
            System.out.printf(doubles.get(j).intValue() + " ");
        }
    }
}
