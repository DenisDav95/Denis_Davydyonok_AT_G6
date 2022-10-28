package project.container.vessel;

import project.container.material.Material;
import project.container.material.Plastic;
import project.staff.Bubble;
import project.staff.SparklingWater;
import project.staff.Transformable;
import project.staff.Water;

import java.util.ArrayList;
import java.util.List;

public class Bottle extends Vessel implements Containable {

    private Water water;

    public Bottle() {
        super(1.0, 2.0, 100, new Plastic());
        int numberOfBubbles = (int) (getVolume() * 10000);
        Bubble bubble = new Bubble("Oxygen");
        List<Bubble> bubbles = new ArrayList<>();
        for (int i = 0; i < numberOfBubbles; i++) {
            bubbles.add(bubble);
        }
        water = new SparklingWater();
        ((SparklingWater) water).pump(bubbles);
        System.out.printf("Created " + getVolume() + " liter sparkling water bottle").println();
    }

    public Bottle(double volume, double diameter, int weight, Material material) {
        super(volume, diameter, weight, material);
        int numberOfBubbles = (int) (getVolume() * 10000);
        Bubble bubble = new Bubble("Oxygen");
        List<Bubble> bubbles = new ArrayList<>();
        for (int i = 0; i < numberOfBubbles; i++) {
            bubbles.add(bubble);
        }
        water = new SparklingWater();
        ((SparklingWater) water).pump(bubbles);
        System.out.printf("Created " + getVolume() + " liter sparkling water bottle").println();
    }

    public Bottle(double volume) {
        this();
        setVolume(volume);
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

    @Override
    public void addStuff(Transformable stuff) {

    }

    @Override
    public Transformable removeStuff() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int getFreeSpace() {
        return 0;
    }

    @Override
    public void close() {
        System.out.printf("Close the bottle").println();
        ((SparklingWater) water).setOpened(true);
    }

    @Override
    public void open() {
        System.out.printf("Open the bottle").println();
        ((SparklingWater) water).setOpened(true);
    }

    public void warm(int temperature) {
        System.out.printf("Warming water to: %s", temperature).println();
        water.setTemperature(temperature);
    }

    public Water getWater() {
        return water;
    }

    public void setWater(Water water) {
        this.water = water;
    }
}
