package project.stuff;

import java.util.List;

public class SparklingWater extends Water {

    private boolean isOpened;
    private List<Bubble> bubbles;

    public SparklingWater() {
        isOpened();
    }

    public void pump(List<Bubble> bubbles) {
        System.out.printf("Creating the sparkling water").println();
        this.bubbles = bubbles;
    }

    @Override
    public void setOpened() {
        isOpened = true;
        isOpened();
    }

    private void isOpened() {
        new Thread(() -> {
            while (!isOpened) {
                System.out.printf("Checking if the water is open").println();
                if (isOpened) {
                    System.out.printf("Water is open").println();
                    try {
                        degas();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                } else {
                    System.out.printf("Water is close").println();
                }
            }
        }).start();
    }

    private void degas() throws InterruptedException {
        System.out.printf("Degasing water from the bottle").println();
        while (bubbles.size() != 0) {
            bubbles.get(0).cramp();
            bubbles.remove(0);
            Thread.sleep(1000/(10 + 5 * getTemperature()));
            if (isSparkle()) {
                System.out.println("There are bubbles in the water");
            } else {
                System.out.println("There are no bubbles in the water");
            }
        }
    }

    public boolean isSparkle() {
        return !bubbles.isEmpty();
    }

}
