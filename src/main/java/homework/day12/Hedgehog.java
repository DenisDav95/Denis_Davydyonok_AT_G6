package homework.day12;

public class Hedgehog {

    private String pattern = "Hedgehog <n>";
    private String name;

    public Hedgehog(int number) {
        this.name = "Hedgehog" + " " + number;
    }

    public void tellMe() {
        System.out.println("I am " + getName() + " !");
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
