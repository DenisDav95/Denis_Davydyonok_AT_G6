package classwork.day6;

public class GenericContainer<T> {

    private T[] objectContainer = (T[]) new Object[10];
    private int freePlace;

    public void add(T incoming) {
        if (freePlace < 10) {
            objectContainer[freePlace++] = incoming;
        } else {
            System.out.println("Больше нету свободных мест");
        }

    }

    public T removeLast() {
        T last = null;
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
