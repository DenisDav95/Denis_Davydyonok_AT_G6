package homework.day2.basetask;

public class Bee {

    private String gender;
    private long weight;

    public void setGender(String beeGender) {
        gender = beeGender;
    }

    public String getGender() {
        return gender;
    }

    public void setWeight(long beeWeight) {
        weight = beeWeight;
    }

    public long getWeight() {
        return weight;
    }

    public Bee() {
        gender = "Кукуха";
        weight = 1;
    }

    public Bee(String beeGender, long beeWeight) {
        gender = beeGender;
        weight = beeWeight;
    }

    public void printBeeDetails() {
        System.out.println("Я легче лося в " + 500/weight + " раз");
    }





}
