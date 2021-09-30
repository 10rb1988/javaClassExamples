package week4Lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class collectionsAnimals {
    public static void main(String[] args) {

        List<String> animals = new ArrayList<>();

        animals.add("Cat");
        animals.add("Zebra");
        animals.add("Fish");
        animals.add("Bird");
        animals.add("Fish");

        System.out.println("Original animals list: " + animals);

        Collections.sort(animals); // sort into order if datatype is sortable

        System.out.println("\nThe sorted animals list is :" + animals);

        // replace list items Fish with Shark
        Collections.replaceAll(animals, "Fish", "Shark");
        System.out.println("Replace \"Fish\" with \"Shark\", now the list is: " + animals);

        // reverse order of list
        Collections.reverse(animals);
        System.out.println("The reversed animals list: " + animals);

        // randomize list
        Collections.shuffle(animals);
        System.out.println("Randomized animals list: " + animals);

        // Display the minimum value = the lowest value for strings = lowest letter
        System.out.println("First in the alphabet: " + Collections.min(animals));

        // Display the max value
        System.out.println("Last in the alphabet: " + Collections.max(animals));

        // Fill entire ArrayList with "Koala"
        Collections.fill(animals, "Koala");
        System.out.println("Replaced every element with Koala: " + animals);
    }
}
