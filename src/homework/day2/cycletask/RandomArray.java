package homework.day2.cycletask;

import java.util.Random;
import java.util.Arrays;

public class RandomArray {

    static int[] array = new int[7];
    static Random random = new Random();

    public void createArray(){

        for (int i = 0; i <= array.length - 1; i++) {
            array[i] = random.nextInt(7);
        }
    }

    public void printArray() {
        for (int i = 0; i <= array.length - 1; i++) {
            System.out.print(array[i]);
            System.out.print(" ");
        }
    }

    public void printArrayRev() {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i]);
            System.out.print(" ");
        }
    }

    public void multiplyArray() {
        for (int i = 0; i <= array.length - 1; i++) {
            System.out.print(array[i] * 5);
            System.out.print(" ");
        }
    }

    public void squareArray() {
        for (int i = 0; i <= array.length - 1; i++) {
            System.out.print(array[i] * array[i]);
            System.out.print(" ");
        }
    }

    public void minArray() {
        int min = array[0];
        for (int i = 0; i <= array.length - 1; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println(min);
    }

    public void revElementArray() {
        int firstElement = array[0];
        int lastElement = array[array.length - 1];
        array[0] = lastElement;
        array[array.length - 1] = firstElement;

        for (int i = 0; i <= array.length - 1; i++) {
            System.out.print(array[i]);
            System.out.print(" ");
        }
    }

    public void sortArray() {

        Arrays.sort(array);

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i]);
            System.out.print(" ");
        }
    }

}

