package homework.day6;

import java.util.ArrayList;

public class FindDuplicate {

    public void findDuplicate(String text) {

        String[] words = text.split("[^A-Za-zА-Яа-я]+");
        ArrayList<String> duplicate = new ArrayList<>();

        for (String i : words) {
            int counter = 0;
            for (int j = 0; j < words.length; j++) {
                if (words[j].equals(i)) {
                    counter++;
                }
                if (counter > 1) {
                    if (!duplicate.contains(i)) {
                        System.out.println(i);
                        duplicate.add(i);
                    }
                    break;
                }

            }
        }

        if (duplicate.isEmpty()) {
            System.out.println("Текст не содержит дублирующихся слов");
        }
    }

}
