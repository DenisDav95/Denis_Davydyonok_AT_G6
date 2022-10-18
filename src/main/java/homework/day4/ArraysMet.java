package homework.day4;

//    работа с массивами и консолью (делаете в 1-м классе, имя класса произвольное)


// -- написать метод, который вернет сумму тех элементов целочисленного массива, которые кратны числу текущего
//    месяца (массив подается в сигнатуру метода)
// -- написать метод, который "нарисует" в консоли следующий рисунок:
//
//        ^__^
//        (oo)\\_______
//        (__)\ ) \/\  \
//        ||----w |\
//        ||     ||
//
//    (при копировании текста из скайпа в блокнот оно выравняется и станет более понятным, и не мудрите, это простая последовательность из .println())
//


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

// -- написать метод, который вернет целочисленный массив, состоящий только из тех элементов исходного целочисленного массива
//    (подается на вход этого метода), которые больше, чем число n, где n - целое число, передаваемое в сигнатуру
//    этого метода, элементы в результирующем массиве должны быть расположены в обратном порядке

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

}
