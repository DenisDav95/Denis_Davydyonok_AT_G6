package homework.day12.threads;

import homework.day12.Mouse;

import java.util.ArrayList;
import java.util.List;

public class FiveThreads {

    public static void main(String[] args) {

        new Thread(FiveThreads::MousePeep).start();
        new Thread(FiveThreads::MousePeep).start();
        new Thread(FiveThreads::MousePeep).start();
        new Thread(FiveThreads::MousePeep).start();
        new Thread(FiveThreads::MousePeep).start();
    }

    private static void MousePeep() {
        List<Mouse> mouses = new ArrayList<>();
        for (int j = 0; j < 20; j++) {
            mouses.add(new Mouse(j));
        }

        mouses.forEach(Mouse::peep);
    }
}
