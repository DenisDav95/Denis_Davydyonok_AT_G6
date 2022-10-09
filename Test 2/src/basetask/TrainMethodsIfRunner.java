package basetask;

public class TrainMethodsIfRunner {

    public static void main(String[] args) {

        TrainMethodsIf output = new TrainMethodsIf();

        int outputInt = output.returnNewInt(9);
        System.out.println("Метод returnNewInt вернул " + outputInt);

        long outputLong = output.returnNewLong(9223372036854775500L);
        System.out.println("Метод returnNewLong вернул " + outputLong);

        String outputString = output.returnNewChar('\u0950');
        System.out.println("Метод returnNewChar вернул " + outputString);

        float outputFloat = output.returnNewFloat(0.67F);
        System.out.println("Метод returnNewFloat вернул " + outputFloat);

        double outputDouble = output.returnNewDouble(405D);
        System.out.println("Метод returnNewDouble вернул " + outputDouble);

        output.returnNewBoolean(true);
    }

}
