package cycletask;

public class CycleTaskRunner {

    public static void main(String[] args) {

        NumLineWhile output1 = new NumLineWhile();
        NumLineFor output2 = new NumLineFor();
        RandomArray output3 = new RandomArray();

        System.out.println("Строка чисел от 0 до 20");
        output1.printNumLine();
        System.out.println(" ");
        System.out.println("Строка нечетных чисел от 3 до 19");
        output2.printNumLine();
        output3.createArray();
        System.out.println(" ");
        System.out.println("Начальный рандомный массив");
        output3.printArray();
        System.out.println(" ");
        System.out.println("Начальный рандомный массив в обратном порядке");
        output3.printArrayRev();
        System.out.println(" ");
        System.out.println("Начальный рандомный массив и элементы умножены на 5");
        output3.multiplyArray();
        System.out.println(" ");
        System.out.println("Начальный рандомный массив и элементы в квадрате");
        output3.squareArray();
        System.out.println(" ");
        System.out.println("Минимальный элемент начального массива");
        output3.minArray();
        System.out.println("Замена местами первого и последнего элемента массива");
        output3.revElementArray();
        System.out.println(" ");
        System.out.println("Сортировка массива по убыванию");
        output3.sortArray();
    }

}
