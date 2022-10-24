package homework.day6;

public class FindNumber {

    public void findNumber(String text) {

        String[] sybmols = text.split("");
        String numbersInText = "";

        for (String i : sybmols) {
            switch (i) {
                case "0", "1", "2", "3", "4", "5", "6", "7", "8", "9":
                    numbersInText = numbersInText.concat(i);
                    break;
                default:
                    break;
            }
        }

        int[] intNumbersArray = new int[numbersInText.length()];
        String[] strNumbersArray = numbersInText.split("");

        for (int i = 0; i < intNumbersArray.length; i++) {
            intNumbersArray[i] = Integer.parseInt(strNumbersArray[i]);
            System.out.println(intNumbersArray[i]);
        }

        if (numbersInText.isEmpty()) {
            System.out.println("В тексте нету цифр");
        }
    }

}
