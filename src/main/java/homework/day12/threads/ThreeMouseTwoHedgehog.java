package homework.day12.threads;

import homework.day12.Hedgehog;
import homework.day12.Mouse;

import java.util.ArrayList;
import java.util.List;

public class ThreeMouseTwoHedgehog {

    private static List<Mouse> mouses = new ArrayList<>();

    public static void main(String[] args) {

        Object lock = new Object();

        for (int j = 0; j < 240; j++) {
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

        Thread t4 = new Thread(ThreeMouseTwoHedgehog::createHedgehog);

        Thread t5 = new Thread(ThreeMouseTwoHedgehog::createHedgehog);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }

    private static void deleteMouse() {
        for (int i = 0; i < mouses.size(); i++) {
            if (Integer.parseInt(mouses.get(i).getName().replace("Mouse ", "")) % 2 != 0) {
                mouses.get(i).peep();
                mouses.remove(i);
                i--;
                try {
                    Thread.sleep(250);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    private static void createHedgehog() {
        for (int i = 0; i < mouses.size(); i++) {
            if (Integer.parseInt(mouses.get(i).getName().replace("Mouse ", "")) % 2 == 0) {
                mouses.get(i).peep();
                new Hedgehog(Integer.parseInt(mouses.get(i).getName().replace("Mouse ", ""))).tellMe();
                try {
                    Thread.sleep(220);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
