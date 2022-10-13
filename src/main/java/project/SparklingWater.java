package project;

public class SparklingWater extends Water {

    private boolean isOpened;
    private Bubble[] bubbles;

    public SparklingWater() {
        isOpened();
    }

    public void pump(Bubble[] bubbles) {
        this.bubbles = bubbles;
    }

    public void setOpened(boolean isOpened) {
        this.isOpened = isOpened;
    }

    private void isOpened() {
        if (isOpened == true) {
            degas();
        }
    }

    private void degas() {

        int sec = 0;
        int numberOfBubbles = bubbles.length;

        while (numberOfBubbles > 0) {
            numberOfBubbles = numberOfBubbles - (10 + 5 * getTemperature());
            sec += 1;
        }
    }

    public boolean isSparkle() {
// Заглушка
        if (0 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
