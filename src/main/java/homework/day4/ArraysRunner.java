package homework.day4;

import java.util.Arrays;
public class ArraysRunner {

    public static void main(String[] args) {

        ArraysMet myArray = new ArraysMet();

        int[] testArray = {1,2,3,4,5,6,7,10,15,20};

        myArray.sumArray(testArray,3);
        System.out.println(Arrays.toString(myArray.newArray(testArray,5)));
        System.out.println(myArray.sumArrayDate(testArray));
        myArray.print();


    }

}
