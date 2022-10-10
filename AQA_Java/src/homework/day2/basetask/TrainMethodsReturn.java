package homework.day2.basetask;

public class TrainMethodsReturn {

    public int returnNewInt(int myInt) {
        return myInt * 3;
    }

    public long returnNewLong(long myLong) {
        return myLong - 4;
    }

    public String returnNewChar(char myChar) {
        String doubleChar = String.valueOf(myChar);
        return doubleChar + doubleChar;
    }

    public float returnNewFloat(float myFloat) {
        return myFloat / 2;
    }

    public double returnNewDouble(double myDouble) {
        return myDouble + 8;
    }

    public short returnNewShort(short myShort) {
        return (short) (myShort - 1);
    }

    public byte returnNewByte(byte myByte) {
        return (byte) (myByte * 2);
    }

    public boolean returnNewBoolean(boolean myBoolean) {
        if (myBoolean == false) {
            return true;
        } else {
            return false;
        }
    }
}

