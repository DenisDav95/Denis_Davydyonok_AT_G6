package project;

import java.util.ArrayList;
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
        int sec = 0;
        int numberOfBubbles = bubbles.size();
        Bubble bubble = new Bubble("Oxygen");

        while (numberOfBubbles > 0) {
            numberOfBubbles = numberOfBubbles - (10 + 5 * getTemperature());
            sec += 1;
            isSparkle();
            bubble.cramp();
        }
        bubbles = new ArrayList<Bubble>();
        isSparkle();
    }

    public boolean isSparkle() {

        if (bubbles.size() != 0) {
            System.out.println("There are bubbles in the water");
            return true;
        } else {
            System.out.println("There are no bubbles in the water");
            return false;
        }
    }
}
