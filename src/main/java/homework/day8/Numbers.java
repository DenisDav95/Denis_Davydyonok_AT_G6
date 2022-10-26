package homework.day8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Numbers {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(Arrays.asList(3342, 34, 79, 23426, 68, 1324, 55, 7699));

        for (int i : numbers) {
            System.out.println(i);
        }

        int sum = 0;
        for (int i : numbers) {
            sum += i;
        }
        System.out.println("Сумма всех чисел  = " + sum);

        numbers.sort(Comparator.naturalOrder());

        for (int i = 0; i < numbers.size(); i++) {
            System.out.printf(numbers.get(i) + " ");
        }
        System.out.println();

        numbers.sort(Comparator.reverseOrder());

        for (int i : numbers) {
            System.out.printf(i + " ");
        }
    }
}
