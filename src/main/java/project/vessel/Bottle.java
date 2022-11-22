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

    public Bottle() {
        this(1.0, Material.METAL);

    }

    public void addStuff(Transformable stuff) {
        this.stuff = stuff;
    }

    public Transformable removeStuff() {
        return stuff;
    }

    public boolean isEmpty() {
        return false;
    }

    public void open() {
        System.out.printf("Open the bottle").println();
        water.setOpened();
    }

    public void warm(int temperature) {
        System.out.printf("Warming stuff to: %s", temperature).println();
        water.setTemperature(temperature);
    }

}
