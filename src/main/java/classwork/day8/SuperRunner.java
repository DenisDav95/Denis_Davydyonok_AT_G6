package classwork.day8;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SuperRunner {

    public static void main(String[] args) {

        Set<String> myList1 = new HashSet<>();
        Set<String> myList2 = new TreeSet<>();

        for (int i = 0; i < 20000000; i++) {
            myList1.add("Value " + i);
            myList2.add("Test " + i);
        }

        Iterator<String> iterator1 = myList1.iterator();
        Iterator<String> iterator2 = myList2.iterator();

        long t0 = System.currentTimeMillis();
        while (iterator1.hasNext()) {
            iterator1.next();
        }
        System.out.println(System.currentTimeMillis() - t0);

        long t2 = System.currentTimeMillis();
        while (iterator2.hasNext()) {
            iterator2.next();
        }
        System.out.println(System.currentTimeMillis() - t2);
    }

}
