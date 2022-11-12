package project.vessel;

import project.material.Material;
import project.stuff.Bubble;
import project.stuff.SparklingWater;
import project.stuff.Transformable;
import project.stuff.Water;

import java.util.ArrayList;
import java.util.List;

public class Bottle extends Vessel implements Containable {

    private Water water;
    private Transformable stuff;

    public Bottle(double volume, Material material) {
        super(volume, 2.0, material);
        int numberOfBubbles = (int) (getVolume() * 10000);
        List<Bubble> bubbles = new ArrayList<>();
        for (int i = 0; i < numberOfBubbles; i++) {
            bubbles.add(new Bubble());
        }
        water = new SparklingWater();
        ((SparklingWater) water).pump(bubbles);
        System.out.printf("Created " + getVolume() + " liter sparkling water bottle").println();
    }

    @Override
    public void addStuff(Transformable stuff) {

        this.stuff = stuff;
    }

    @Override
    public Transformable removeStuff() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

//    @Override
//    public int getFreeSpace() {
//        return 0;
//    }

//    public void close() {
//        System.out.printf("Close the bottle").println();
//        ((SparklingWater) water).setOpened();
//    }

    @Override
    public void open() {
        System.out.printf("Open the bottle").println();
        water.setOpened();
    }

    public void warm(int temperature) {
        System.out.printf("Warming stuff to: %s", temperature).println();
        water.setTemperature(temperature);
    }

//    public Water getWater() {
//        return water;
//    }
//
//    public void setWater(Water water) {
//        this.water = water;
//    }
}
