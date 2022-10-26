package homework.day8;

import homework.day8.Objects.Sand;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sandbox {

    public static void main(String[] args) {

        List<Sand> sandbox = new ArrayList<>();

        sandbox.add(new Sand(2, "Речной"));
        sandbox.add(new Sand(4, "Речной"));
        sandbox.add(new Sand(2, "Карьерный"));
        sandbox.add(new Sand(7, "Речной"));

        for (Sand i : sandbox) {
            System.out.printf(i.getWeight() + " ");
        }
        System.out.println();

        for (Sand i : sandbox) {
            System.out.printf(i.getName() + " ");
        }
        System.out.println();

        Map<Integer, Sand> sandMap = new HashMap<>();

        for (int i = 0; i < sandbox.size(); i++) {
            sandMap.put(i, sandbox.get(i));
        }

        for (Integer i : sandMap.keySet()) {
            System.out.printf(i + " ");
        }
        System.out.println();

        for (Sand i : sandMap.values()) {
            System.out.println(i.toString());
        }

        for (Map.Entry<Integer, Sand> i : sandMap.entrySet()) {
            System.out.println(i);
        }
    }
}
