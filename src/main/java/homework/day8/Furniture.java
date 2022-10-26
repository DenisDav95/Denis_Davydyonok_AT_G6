package homework.day8;

import homework.day8.Objects.Chair;

import java.util.*;

public class Furniture {

    public static void main(String[] args) {

        List<Chair> furniture = new ArrayList<>(Arrays.asList(new Chair(1, 2), new Chair(4, 2), new Chair(2, 4)));

        for (Chair i : furniture) {
            System.out.print(i.getHeight() * i.getWidth() + " ");

        }
        System.out.println();

        Map<Integer, Chair> furnitureMap = new HashMap<>();

        for (int i = 0; i < furniture.size(); i++) {
            furnitureMap.put(i, furniture.get(i));
        }

        for (Integer i : furnitureMap.keySet()) {
            System.out.println(i);
        }

        for (Chair i : furnitureMap.values()) {
            System.out.println(i);
        }

        for (Map.Entry<Integer, Chair> i : furnitureMap.entrySet()) {
            System.out.println(i);
        }
    }
}
