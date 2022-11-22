package project.vessel;

import project.material.Material;
import project.stuff.Transformable;

public class Cup extends Vessel implements Containable {

    private Transformable stuff;

    public Cup(double volume, Material material) {
        super(volume, 8.0, material);
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

    }

    public void warm(int temperature) {
        stuff.setTemperature(temperature);
    }
}
