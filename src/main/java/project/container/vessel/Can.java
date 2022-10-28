package project.container.vessel;

import project.container.material.Material;
import project.container.material.Metal;
import project.staff.Transformable;

public class Can extends Vessel implements Containable {

    public Can() {
        super(0.3, 0.15, 200, new Metal());
    }

    public Can(double volume, double diameter, int weight, Material material) {
        super(volume, diameter, weight, material);
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
    public void open() {

    }

    @Override
    public void close() {

    }
}
