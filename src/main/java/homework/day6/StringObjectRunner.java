package homework.day6;

public class StringObjectRunner {

    public static void main(String[] args) {

        PrintString testStringOne = new PrintString();
        FindDuplicate testText = new FindDuplicate();

        testStringOne.printString("Вася пупкин");
        testText.findDuplicate("Тестовый текст, для проверки дубликата! И если тут нет дубликата, то текст плохой((");
    }

}
