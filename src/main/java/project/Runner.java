package project;

import project.container.vessel.Bottle;
import project.container.material.*;

public class Runner {

    public static void main(String[] args) {

        Bottle bottle1 = new Bottle(0.5, 0.5, 4, new Metal(15, "green", 1.2));
        bottle1.open();

        Bottle bottle2 = new Bottle();
        bottle2.open();

        Bottle bottle3 = new Bottle(1.5);
        bottle3.open();
    }
}
