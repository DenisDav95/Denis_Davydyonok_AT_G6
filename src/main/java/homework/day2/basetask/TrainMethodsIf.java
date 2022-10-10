package homework.day2.basetask;

public class TrainMethodsIf {

    public int returnNewInt(int myInt) {
        if (myInt < 8) {
            return myInt * 7;
        } else {
            return myInt / 4;
        }
    }

    public long returnNewLong(long myLong) {
        if (myLong > 300) {
            return myLong - 300;
        } else {
            return myLong + 20;
        }
    }

    public String returnNewChar(char myChar) {
        if (myChar == '\u0067') {
            return "go";
        } else {
            return "0" + myChar;
        }
    }

    public float returnNewFloat(float myFloat) {
        if (myFloat == 0.67F) {
            return myFloat;
        } else {
            return myFloat * 2;
        }
    }

    public double returnNewDouble(double myDouble) {
        if (myDouble > 30 && myDouble < 80) {
            return myDouble + 87;
        } else if (myDouble > 80 && myDouble < 400) {
            return myDouble - 87;
        } else if (myDouble > 400) {
            return myDouble / 4;
        } else {
            return myDouble;
        }
    }

    public void returnNewBoolean(boolean myBoolean) {
        if (myBoolean == true) {
            System.out.println("Я получил на вход значение истины");
        } else {
            System.out.println("Я получил на вход ложь");
        }
    }

}
