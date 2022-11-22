package project.stuff;

public abstract class Water implements Transformable {

    private String color = "no";
    private String smell = "no";
    private int temperature = 0;

    @Override
    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSmell() {
        return smell;
    }

    public void setSmell(String smell) {
        this.smell = smell;
    }

    public int getTemperature() {
        return temperature;
    }
}
