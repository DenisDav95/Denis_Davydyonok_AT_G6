package project.vessel;

import project.stuff.Transformable;

public interface Containable {

    // adds some stuff (e.g. water, sand) to Containable object
    void addStuff(Transformable stuff);

    // removes all stuff away
    Transformable removeStuff();

    // returns true if there is no stuff inside
    boolean isEmpty();

    // forces Containable to be opened
    void open();

    void warm(int temperature);
}
