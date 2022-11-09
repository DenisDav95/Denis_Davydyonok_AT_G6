package classwork.day12;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class RunMap {

    public static int sum = 0;

    public static void main(String[] args) throws InterruptedException {

        Map<Integer, Integer> testMap = new ConcurrentHashMap<>();

        new Thread(() -> {
            for (int i = 0; i < 1_0_000; i++) {
                testMap.put(i, i);
            }
        }).start();

        new Thread(() -> {
            for (int i = 0; i < 1_0_000; i++) {
                testMap.forEach((k, v) -> sum += v);
            }
            System.out.println(sum);
        }).start();

    }
}
