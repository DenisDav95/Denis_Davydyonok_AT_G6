package project.container.material;

public class Metal extends Material {

    public Metal() {
        super(1.0, "gray", 1.5);
    }

    public Metal(double thermalConductivity, String color, double density) {
        super(thermalConductivity, color, density);
    }
}
