package week4Lists;

import java.util.ArrayList;
import java.util.List;

public class arrayLists {
    public static void main(String[] args) {

        // initialize list
        List<String> arrayList = new ArrayList<>();

        // add data to list
        arrayList.add("Hello");
        arrayList.add("World");
        arrayList.add("Robbie");
        arrayList.add("Barr");
        arrayList.add("MCTC");
        // loop over list and print
        for (String s: arrayList) {

        // print contents line by line
            System.out.println((s));
            System.out.println((s.toUpperCase()));
            System.out.println((s.length()));
        }
        // print whole list
        System.out.println();
    }

}
