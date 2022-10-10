package classwork.day2;

import java.util.Random;

public class ClassAvg {

    public void fooba() {

        int[] array = new int[10];
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            array[i] = random.nextInt(100);
        }

        int sum = 0;

        for (int x : array) {
            sum = sum + x;
        }

        System.out.println("Avg is: " + sum / 10);
    }
}
