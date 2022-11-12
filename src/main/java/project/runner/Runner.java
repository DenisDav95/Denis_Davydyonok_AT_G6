package project.runner;

import project.vessel.Bottle;
import project.material.*;

public class Runner {

    public static void main(String[] args) {

        Bottle bottle1 = new Bottle(0.5, Material.METAL);
        bottle1.open();

        Bottle bottle2 = new Bottle(1.0, Material.METAL);
        bottle2.open();

        Bottle bottle3 = new Bottle(1.5, Material.METAL);
        bottle3.open();
    }
}
