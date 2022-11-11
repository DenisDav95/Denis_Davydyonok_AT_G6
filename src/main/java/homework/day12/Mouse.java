package homework.day12;

public class Mouse {

    private String pattern = "Mouse <n>";
    private String name;

    public Mouse(int number) {
        this.name = "Mouse " + number;
    }

    public void peep() {
        System.out.println(getName() + " PEEP!");
        try {
            Thread.sleep(200);
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
