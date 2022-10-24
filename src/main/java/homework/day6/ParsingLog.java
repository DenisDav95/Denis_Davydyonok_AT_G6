package homework.day6;

import java.util.ArrayList;

public class ParsingLog {

    public void parsingLog (String text) {

        String[] logs = text.split(",");

        for (String i : logs) {
            i = i.substring(22);
        }

        ArrayList<String> duplicate = new ArrayList<>();

        for (String i : logs) {
            int ipCounter = 0;
            for (String j : logs) {
                if (j.equals(i)) {
                    ipCounter++;
                }
                if (ipCounter >= 1) {
                    if (!duplicate.contains(i)) {
                        System.out.println(i);
                        duplicate.add(i);
                    }
                    break;
                }
            }
        }
    }

}
