package homework.day6;

public class StringObjectRunner {

    public static void main(String[] args) {

        PrintString testStringOne = new PrintString();
        FindDuplicate testTextOne = new FindDuplicate();
        FindNumber testTextTwo = new FindNumber();

        testStringOne.printString("Вася пупкин");
        testTextOne.findDuplicate("Тестовый текст, для проверки дубликата! И если тут нет дубликата, то текст плохой((");
        testTextTwo.findNumber("hjkhdk 38-1 jhjkh r=-321");
    }

}
