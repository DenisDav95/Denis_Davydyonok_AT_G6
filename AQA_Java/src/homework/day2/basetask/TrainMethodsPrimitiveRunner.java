package homework.day2.basetask;

public class TrainMethodsPrimitiveRunner {

    public static void main(String[] args) {

        TrainMethodsPrimitive output = new TrainMethodsPrimitive();

        output.printInt(4555435);
        output.printLong(9223372036854775500L);
        output.printChar('\u0950');
        output.printFloat(10.50F);
        output.printDouble(18000000000000000000000000000000000000000.15D);
        output.printShort((short) 32767);
        output.printByte((byte) 12);
        output.printBoolean(false);

    }
}
