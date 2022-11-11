package homework.day12.threads;

import homework.day12.Mouse;

import java.util.ArrayList;
import java.util.List;

public class SixThreads {

    public static void main(String[] args) {

        new Thread(SixThreads::MousePeep).start();
        new Thread(SixThreads::MousePeep).start();
        new Thread(SixThreads::MousePeep).start();
        new Thread(SixThreads::MousePeep).start();
        new Thread(SixThreads::MousePeep).start();
        new Thread(SixThreads::MousePeep).start();
    }

    private static void MousePeep() {
        List<Mouse> mouses = new ArrayList<>();
        for (int j = 0; j < 26; j++) {
            mouses.add(new Mouse(j));
        }

        mouses.stream()
                .filter(mouse -> Integer.parseInt(mouse.getName().replace("Mouse ", "")) % 2 != 0)
                .forEach(Mouse::peep);
    }
}
