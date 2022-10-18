package classwork.day6;

public class ObjectContainer {

    private Object[] objectContainer = new Object[10];
    private int freePlace;

    public void add(Object incoming) {
        if (freePlace < 10) {
            objectContainer[freePlace++] = incoming;
        } else {
            System.out.println("Больше нету свободных мест");
        }

    }

    public Object removeLast() {
        Object last = null;
        if (freePlace != 0) {
            last = objectContainer[freePlace - 1];
            objectContainer[freePlace-- - 1] = null;
        } else {
            System.out.println("Массив уже пустой");
        }
        return last;
    }

    public boolean isEmpty() {
        return freePlace == 0;
    }


}
