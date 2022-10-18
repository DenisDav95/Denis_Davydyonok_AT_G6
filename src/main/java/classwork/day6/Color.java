package classwork.day6;

public class Color {

//    ConstantContainer setColors = new ConstantContainer();

    public void printColor(String color){
        switch (color) {
            case ConstantContainer.yellow:
                System.out.println("yellow");
                break;
            case ConstantContainer.red:
                System.out.println("red");
                break;
            case ConstantContainer.blue:
                System.out.println("blue");
                break;
            case ConstantContainer.green:
                System.out.println("green");
                break;
            case ConstantContainer.purple:
                System.out.println("purple");
                break;
            default:
                System.out.println("I don't know this color");
                break;
        }
    }

}
