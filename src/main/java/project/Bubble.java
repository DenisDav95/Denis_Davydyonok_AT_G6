package project;

public class Bubble {

    private double volume = 0.3F;
    private String gas;

    public Bubble(String gas) {
        this.gas = gas;
    }

    public void cramp() {
        System.out.print("Cramp!");
    }

    public double getVolume() {
        return volume;
    }

}
