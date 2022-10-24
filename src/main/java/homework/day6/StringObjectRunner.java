package homework.day6;

public class StringObjectRunner {

    public static void main(String[] args) {

//        PrintString testStringOne = new PrintString();
//        FindDuplicate testTextOne = new FindDuplicate();
//        FindNumber testTextTwo = new FindNumber();
        ParsingLog testLog = new ParsingLog();

//        testStringOne.printString("Вася пупкин");
//        testTextOne.findDuplicate("Тестовый текст, для проверки дубликата! И если тут нет дубликата, то текст плохой((");
//        testTextTwo.findNumber("hjkhdk 38-1 jhjkh r=-321");
        testLog.parsingLog("access_log.2020.09.07 212.168.101.5 granted,access_log.2020.09.07 212.168.101.6 denied,access_log.2020.09.07 212.168.101.5 denied");
    }

}
