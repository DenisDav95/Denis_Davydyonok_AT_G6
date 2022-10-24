package classwork.day7;

import java.io.Serializable;

public class Person implements Serializable {

    private String name;
    private int age;
    private int high;
    private int weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHigh() {
        return high;
    }

    public void setHigh(int high) {
        this.high = high;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Person(String name, int age, int high, int weight) {
        this.name = name;
        this.age = age;
        this.high = high;
        this.weight = weight;
    }
}
