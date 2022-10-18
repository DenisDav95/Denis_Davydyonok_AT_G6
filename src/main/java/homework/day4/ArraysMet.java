package homework.day4;

import java.time.LocalDateTime;

public class ArraysMet {

    public void sumArray(int[] array, int numberOfElement) {

        int sum = 0;
        int eachNumber = numberOfElement;

        while (numberOfElement < array.length + 1) {
            sum += array[numberOfElement - 1];
            numberOfElement += eachNumber;
        }

        System.out.println("Cумма каждого " + eachNumber + " элемента массива равна " + sum);

    }

    public int[] newArray(int[] array, int number) {

        int counter = 0;

        for (int i : array) {
            if (i > number) {
                counter += 1;
            }
        }

        int[] newArray = new int[counter];
        int j = counter - 1;

        for (int i = 0; i <= array.length - 1; i++) {
            if (array[i] > number) {
                newArray[j] = array[i];
                j--;
            }
        }
        return newArray;
    }

    public int sumArrayDate(int[] array) {

        int currentMonth = LocalDateTime.now().getMonth().getValue();
        int sum = 0;

        for (int i : array) {
            if (i % currentMonth == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public void print() {
        System.out.println("^__^");
        System.out.println("(oo)\\\\_______");
        System.out.println("(__)\\ ) \\/\\  \\");
        System.out.println("||----w |\\");
        System.out.println("||     ||");
    }

}
