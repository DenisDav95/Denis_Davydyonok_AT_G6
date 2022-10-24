package classwork.day8;

import java.util.ArrayList;
import java.util.List;

public class MyList {

    List<String> myList = new ArrayList<String>();
    String[] words = "мама мыла раму мыла".split(" ");

    public void createList() {
        for (String i : words) {
            myList.add(i);
        }
    }

    public void printOne() {
        for (String i : myList) {
            System.out.println(i);
        }
    }

    public void printTwo() {
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }
    }


}
