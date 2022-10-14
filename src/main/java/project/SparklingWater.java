package project;

public class SparklingWater extends Water {

    private boolean isOpened;
    private Bubble[] bubbles;

    public SparklingWater() {
//  Не понимаю зачем мы проверяем газировку открыта она или нет
//  при создании и почему это свойсво газировки, если открытой или
//  закрытой может быть именно бутылка
        isOpened();
    }

    public void pump(Bubble[] bubbles) {
        System.out.printf("Creating the sparkling water").println();
        this.bubbles = bubbles;
    }

    public void setOpened(boolean isOpened) {
        this.isOpened = isOpened;
        isOpened();
    }

    private void isOpened() {
        System.out.printf("Checking if the water is open").println();
        if (isOpened == true) {
            System.out.printf("Water is open").println();
            degas();
        } else {
            System.out.printf("Water is close").println();
        }
    }

    private void degas() {
        System.out.printf("Degasing water from the bottle").println();
        int sec = 0;
        int numberOfBubbles = bubbles.length;
        Bubble bubble = new Bubble("Oxygen");

        while (numberOfBubbles > 0) {
            numberOfBubbles = numberOfBubbles - (10 + 5 * getTemperature());
            sec += 1;
            isSparkle();
            bubble.cramp();
        }
        bubbles = new Bubble[0];
        isSparkle();
    }

    public boolean isSparkle() {

        if (bubbles.length != 0) {
            System.out.println("There are bubbles in the water");
            return true;
        } else {
            System.out.println("There are no bubbles in the water");
            return false;
        }
    }
}
