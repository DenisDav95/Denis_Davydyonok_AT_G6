package homework.day2.basetask;

public class Souce {

    private String name;
    private String color;

    public void setName(String souceName) {
        name = souceName;
    }

    public String getName() {
        return name;
    }

    public void setColor(String souceColor) {
        color = souceColor;
    }

    public String getColor() {
        return color;
    }

    public Souce() {
        name = "Каччи";
        color = "зеленый";
    }

    public Souce(String souceName, String souceColor) {
        name = souceName;
        color = souceColor;
    }

    public void printSouceDetails() {
        System.out.println("Это соус " + name + " " + color + " цвета");
    }

}
