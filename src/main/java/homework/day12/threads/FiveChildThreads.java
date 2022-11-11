package homework.day12.threads;

import homework.day12.Mouse;

import java.util.ArrayList;
import java.util.List;

public class FiveChildThreads {

    private static List<Mouse> mouses = new ArrayList<>();

    public static void main(String[] args) {

        Object lock = new Object();

        for (int j = 0; j < 280; j++) {
            mouses.add(new Mouse(j));
        }

        Thread t1 = new Thread(() -> {
            synchronized (lock) {
                deleteMouse();
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (lock) {
                deleteMouse();
            }
        });

        Thread t3 = new Thread(() -> {
            synchronized (lock) {
                deleteMouse();
            }
        });

        Thread t4 = new Thread(() -> {
            synchronized (lock) {
                deleteMouse();
            }
        });

        Thread t5 = new Thread(() -> {
            synchronized (lock) {
                deleteMouse();
            }
        });

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }

    private static void deleteMouse() {
        for (int i = 0; i < mouses.size(); i++) {
            mouses.get(i).peep();
            mouses.remove(i);
            i--;
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
