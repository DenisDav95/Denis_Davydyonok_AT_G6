package project;

public class Bottle {

    private double volume;
    private Water water;

    public Bottle(double volume) {
        this.volume = volume;
        int numberOfBubbles = (int) (volume * 10000);
        Bubble[] bubbles = new Bubble[numberOfBubbles];
        ((SparklingWater)water).pump(bubbles);
    }

    public void open() {
        ((SparklingWater)water).setOpened(true);
    }

    public void warm(int temperature) {
        water.setTemperature(temperature);
    }


    public Water getWater() {
        return water;
    }

    public void setWater(Water water) {
        this.water = water;
    }
}
