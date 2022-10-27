package project;

import java.util.ArrayList;
import java.util.List;

public class Bottle {

    private double volume;
    private Water water;

    public Bottle(double volume) {
        this.volume = volume;
        int numberOfBubbles = (int) (volume * 10000);
        Bubble bubble = new Bubble("Oxygen");
        List<Bubble> bubbles = new ArrayList<>();
        for (int i = 0; i < numberOfBubbles; i++) {
            bubbles.add(bubble);
        }
        water = new SparklingWater();
        ((SparklingWater) water).pump(bubbles);
        System.out.printf("Created " + volume + " liter sparkling water bottle").println();
    }

    public Water getWater() {
        return water;
    }

    public void setWater(Water water) {
        this.water = water;
    }

    public void open() {
        System.out.printf("Opening the bottle").println();
        ((SparklingWater) water).setOpened(true);
    }

    public void warm(int temperature) {
        System.out.printf("Warming water to: %s", temperature).println();
        water.setTemperature(temperature);
    }
}
