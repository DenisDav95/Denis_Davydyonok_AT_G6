package project.vessel;

import project.material.Material;
import project.stuff.Transformable;

public class Cup extends Vessel implements Containable {

    private Transformable stuff;

    public Cup(double volume, Material material) {
        super(volume, 8.0, material);
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

//    @Override
//    public int getFreeSpace() {
//        return 0;
//    }

    @Override
    public void open() {

    }

    @Override
    public void warm(int temperature) {
        stuff.setTemperature(temperature);
    }

//    @Override
//    public void close() {
//    }
}
