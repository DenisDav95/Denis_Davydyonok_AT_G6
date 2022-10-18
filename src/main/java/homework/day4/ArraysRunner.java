package homework.day4;

import java.util.Arrays;
public class ArraysRunner {

    public static void main(String[] args) {

        ArraysMet myArray = new ArraysMet();

        int[] testArray = {1,2,3,4,5,6,7};

        myArray.sumArray(testArray,3);
        System.out.println(Arrays.toString(myArray.newArray(testArray,5)));


    }

}
