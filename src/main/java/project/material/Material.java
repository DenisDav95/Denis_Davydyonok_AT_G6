package project.material;

public enum Material {
    GLASS(0.017, "green", 2200),
    PLASTIC(0.2, "white", 1800),
    METAL(58.0, "silver", 7800);

    private double thermalConductivity;
    private String color;
    private double density;

    Material(double thermalConductivity, String color, double density) {
        this.thermalConductivity = thermalConductivity;
        this.color = color;
        this.density = density;
    }

    public double getThermalConductivity() {
        return thermalConductivity;
    }

    public String getColor() {
        return color;
    }

    public double getDensity() {
        return density;
    }
}