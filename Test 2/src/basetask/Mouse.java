package basetask;

public class Mouse {

    private String name;
    private int age;

    public void setName(String mouseName) {
        name = mouseName;
    }
    public String getName() {
        return name;
    }

    public void setAge(int mouseAge) {
        age = mouseAge;
    }
    public int getAge() {
        return age;
    }

    public Mouse() {
        name = "Джо";
        age = 3;
    }

    public Mouse(String mouseName, int mouseAge) {
        name = mouseName;
        age = mouseAge;
    }

    public void printMouseDetails() {
        System.out.println("Я мышь, меня зовут " + name + " и мне " + age);
    }
}
