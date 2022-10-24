package classwork.day7;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Scanner;

public class Runner {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

//        MyReader.read();
//        MyReader.write();

//        Scanner scanner = new Scanner(System.in);
//
//        while (scanner.hasNext()){
//            String incoming =scanner.nextLine();
//            if (incoming.equals("стоп")) {
//                break;
//            }
//            System.out.printf("Just got '%s' text!", incoming);
//        }

        Person p1 = new Person("Vas", 15,180,60);
        Person p2 = new Person("Kate", 20,165,45);

        System.out.println(p1);
        System.out.println(p2);

        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());

        System.out.println(p1.equals(p2));






//        ObjectReadWrite.write();
//        ObjectReadWrite.read();

    }

}
