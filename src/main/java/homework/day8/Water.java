package homework.day8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Water {

    public static void main(String[] args) {

        List<homework.day8.Objects.Water> water = new ArrayList<>(Arrays.asList(new homework.day8.Objects.Water("Прозрачная", "Нет"), new homework.day8.Objects.Water("Прозрачная", "Нет"), new homework.day8.Objects.Water("Мутная", "Аммиачный")));

        for (homework.day8.Objects.Water i : water) {
            System.out.println(i.getColor() + "-" + i.getSmell());
        }
    }
}
