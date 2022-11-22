package project.vessel;

import project.material.Material;
import project.stuff.Transformable;

public class Can extends Vessel implements Containable {

    private Transformable stuff;

    public Can(double volume, Material material) {
        super(volume, 10.0, material);
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
