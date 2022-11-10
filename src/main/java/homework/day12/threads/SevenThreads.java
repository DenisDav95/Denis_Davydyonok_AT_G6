package homework.day12.threads;

import homework.day12.Mouse;

import java.util.ArrayList;
import java.util.List;

public class SevenThreads {

    public static void main(String[] args) {

        new Thread(SevenThreads::MousePeep).start();
        new Thread(SevenThreads::MousePeep).start();
        new Thread(SevenThreads::MousePeep).start();
        new Thread(SevenThreads::MousePeep).start();
        new Thread(SevenThreads::MousePeep).start();
        new Thread(SevenThreads::MousePeep).start();
        new Thread(SevenThreads::MousePeep).start();
    }

    private static void MousePeep() {
        List<Mouse> mouses = new ArrayList<>();
        for (int j = 0; j < 18; j++) {
            mouses.add(new Mouse(j));
        }

        mouses.stream()
                .filter(mouse -> Integer.parseInt(mouse.getName().replace("Mouse ", "")) % 2 == 0)
                .forEach(Mouse::peep);
    }
}
