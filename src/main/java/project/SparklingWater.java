package project;

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

    public void setOpened(boolean isOpened) {
        this.isOpened = isOpened;
        isOpened();
    }

    private void isOpened() {
        System.out.printf("Checking if the water is open").println();
        if (isOpened) {
            System.out.printf("Water is open").println();
            degas();
        } else {
            System.out.printf("Water is close").println();
        }
    }

    private void degas() {
        System.out.printf("Degasing water from the bottle").println();
        while (bubbles.size() != 0) {
            bubbles.get(0).cramp();
            bubbles.remove(0);
            if (isSparkle()) {
                System.out.println("There are bubbles in the water");
            } else {
                System.out.println("There are no bubbles in the water");
            }
        }
        isSparkle();
    }

    public boolean isSparkle() {
        return !bubbles.isEmpty();
    }
}
