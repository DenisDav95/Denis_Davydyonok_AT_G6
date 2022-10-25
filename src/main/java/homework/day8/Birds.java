package homework.day8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Birds {

    public static void main(String[] args) {

        List<String> birds = new ArrayList<>(Arrays.asList("Чайка", "Дрозд", "Бусел", "Голубь", "Воробей", "Цапля"));

        for (String i : birds) {
            System.out.println("--" + i + "--");
        }

        int counterBirds = 0;
        for (String i : birds) {
            int counterVowel = 0;
            for (int j = 0; j < i.length(); j++) {
                switch (String.valueOf(i.charAt(j)).toLowerCase()) {
                    case "а", "у", "о", "е", "и", "я", "ю", "ё", "э", "ы":
                        counterVowel++;
                        break;
                }
            }
            if (counterVowel > 1) {
                counterBirds++;
            }
        }
        System.out.println(counterBirds + " птиц содержат более 1 гласной буквы в названии");

        for (int i = 0; i < birds.size(); i++) {
            System.out.printf(birds.get(i) + " ");
        }
        System.out.println();

        birds.set(3, "Синица");

        for (String i : birds) {
            System.out.printf(i + " ");
        }
    }
}
