package week4Lists;

import java.util.ArrayList;
import java.util.List;

public class addingDataInteger {
    public static void main(String[] args) {

        // set up int ArrayList
        List<Integer> classCodes = new ArrayList<>();

        // add
        classCodes.add(2345);
        classCodes.add(1150);
        classCodes.add(1250);

        // add at a position
        classCodes.add(0, 1425);

        // print list
        System.out.println(classCodes);

        // print size of list
        System.out.println(classCodes.size());

        // loop over list
        for (int classCode: classCodes) {
            System.out.println("ITEC " + classCode);


        }

        // JAVA DEFAULT DELETES BY INTEGER POSITION
        classCodes.remove(0); // removes position zero

        // removes integer VALUE from list
        classCodes.remove( Integer.valueOf(1250) );

    }
}
