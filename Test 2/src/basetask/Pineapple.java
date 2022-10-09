package basetask;

public class Pineapple {

    private String grade;
    private float heatCapacity;

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }

    public void setHeatCapacity(float heatCapacity) {
        this.heatCapacity = heatCapacity;
    }

    public float getHeatCapacity() {
        return heatCapacity;
    }

    public Pineapple() {
        grade = "речной";
        heatCapacity = 2140.01F;
    }

    public void printPineappleDetails() {
        if (heatCapacity > 2140) {
            System.out.println("Я ананас, теплоемкость которого больше, чем у ветчины");
        } else {
            System.out.println("В ветчине тепла запасется больше :(");
        }
    }

}
