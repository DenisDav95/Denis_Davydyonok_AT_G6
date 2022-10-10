package homework.day2.basetask;

public class TrainMethodsReturnRunner {

    public static void main(String args[]) {

        TrainMethodsReturn output = new TrainMethodsReturn();

        int outputInt = output.returnNewInt(15);
        System.out.println("Метод returnNewInt вернул " + outputInt);

        long outputLong = output.returnNewLong(9223372036854775500L);
        System.out.println("Метод returnNewLong вернул " + outputLong);

        String outputString = output.returnNewChar('\u0950');
        System.out.println("Метод returnNewChar вернул " + outputString);

        float outputFloat = output.returnNewFloat(10.50F);
        System.out.println("Метод returnNewFloat вернул " + outputFloat);

        double outputDouble = output.returnNewDouble(180000.15D);
        System.out.println("Метод returnNewDouble вернул " + outputDouble);

        short outputShort = output.returnNewShort((short) 32767);
        System.out.println("Метод returnNewShort вернул " + outputShort);

        byte outputByte = output.returnNewByte((byte) 12);
        System.out.println("Метод returnNewByte вернул " + outputByte);

        boolean outputBoolean = output.returnNewBoolean(true);
        System.out.println("Метод returnNewBoolean вернул " + outputBoolean);
    }
}
