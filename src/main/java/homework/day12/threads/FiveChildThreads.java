package homework.day12.threads;

import homework.day12.Mouse;

import java.util.ArrayList;
import java.util.List;

public class FiveChildThreads {

    private static List<Mouse> mouses = new ArrayList<>();

    public static void main(String[] args) {

        for (int j = 0; j < 280; j++) {
            mouses.add(new Mouse(j));
        }

        Thread t1 = new Thread(() -> {
            while (mouses.size() != 0) {
                System.out.println(1);
                deleteMouse();
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread t2 = new Thread(() -> {
            while (mouses.size() != 0) {
                System.out.println(2);
                deleteMouse();
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread t3 = new Thread(() -> {
            while (mouses.size() != 0) {
                System.out.println(3);
                deleteMouse();
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread t4 = new Thread(() -> {
            while (mouses.size() != 0) {
                System.out.println(4);
                deleteMouse();
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread t5 = new Thread(() -> {
            while (mouses.size() != 0) {
                System.out.println(5);
                deleteMouse();
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }

    private static synchronized void deleteMouse() {
        try {
            mouses.get(0).peep();
            mouses.remove(0);
        } catch (Exception e) {
        }
    }
}
