package project.container.material;

public class Plastic extends Material {

    public Plastic() {
        super(0.2, "transparent", 0.2);
    }

    public Plastic(double thermalConductivity, String color, double density) {
        super(thermalConductivity, color, density);
    }
}
