package classwork.day8;

import java.util.*;

public class Runner {

    public static void main(String[] args) {

//        MyList test = new MyList();
//
//        test.createList();
//        test.printOne();
//        test.printTwo();


//        List<String> myList1 = new ArrayList<>();
//        List<String> myList2 = new LinkedList<>();
//
//        for (int i = 0; i < 1000000; i++) {
//            myList1.add("Value " + i);
//            myList2.add("Test " + i);
//        }
//
//        long t0 = System.currentTimeMillis();
//        for (int i = 0; i < myList1.size(); i++) {
//          myList1.get(i);
//        }
//        long t1 = System.currentTimeMillis();
//
//        long t2 = System.currentTimeMillis();
//        for (int j = 0; j < myList2.size(); j++) {
//            myList2.get(j);
//        }
//        long t3 = System.currentTimeMillis();
//
//
//        System.out.println(t1 - t0);
//        System.out.println(t3 - t2);

        Set<String> mySet = new HashSet<>();
        String[] words = "мама мыла раму мыла".split(" ");

        for (String i : words) {
            mySet.add(i);
        }

        Iterator<String> iterator = mySet.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        for (String i : mySet) {
            System.out.println(i);
        }

    }

}
