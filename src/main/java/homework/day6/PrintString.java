package homework.day6;

public class PrintString {

    public void printString(String string) {

//        1.1 сделать метод, который позволяет отпечатать в консоль все буквы в стобик из строки текста, которую принимает на вход в виде аргумента.

        for (int i = 0; i < string.length(); i++) {
            System.out.println(string.charAt(i));
        }


    }

}
