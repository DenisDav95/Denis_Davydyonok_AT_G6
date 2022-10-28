package project.container.material;

public class Glass extends Material {

    public Glass() {
        super(1.0, "transparent", 0.5);
    }

    public Glass(double thermalConductivity, String color, double density) {
        super(thermalConductivity, color, density);
    }
}
