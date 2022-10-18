package homework.day4;

//    работа с массивами и консолью (делаете в 1-м классе, имя класса произвольное)
// -- написать метод, который принимает на вход целочисленном массив и считает сумму каждого n-ого элемента в нем,
//    где n - целое число, передаваемое в сигнатуру этого метода
// -- написать метод, который вернет целочисленный массив, состоящий только из тех элементов исходного целочисленного массива
//    (подается на вход этого метода), которые больше, чем число n, где n - целое число, передаваемое в сигнатуру
//    этого метода, элементы в результирующем массиве должны быть расположены в обратном порядке
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


public class Arrays {

    public void sumArray(int[] array, int numberOfElement) {

        int sum = 0;
        int eachNumber = numberOfElement;

        while (numberOfElement < array.length + 1) {
            sum += array[numberOfElement - 1];
            numberOfElement += eachNumber;
        }

        System.out.println("Cумма каждого " + eachNumber + " элемента массива равна " + sum);

    }


}