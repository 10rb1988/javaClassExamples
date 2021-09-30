package week4Lists;

import java.util.ArrayList;
import java.util.List;

public class workWlistsTrees {
    public static void main(String[] args) {

        // initialize list
        // ArrayList LinkedList VectorList
        List<String> trees = new ArrayList<>();
        // add data to end of list
        trees.add("Pine");
        trees.add("Oak");
        trees.add("Elm");
        trees.add("Aspen");

        // add data at index 2 in the middle
        trees.add(2, "Palm");

        // get by index, prints Oak
        System.out.println("The tree at index 1 is " + trees.get(1));

        // loop through the list and print line by line
        for (String tree: trees) {
            System.out.println(tree);
        }
        // remove by value
        trees.remove("Oak");
        // remove by index
        trees.remove(0);

        // does list contain a string
        if (trees.contains("Aspen")) {
            System.out.println("The tree list contains Aspen");
        }

        // how many items in list
        int numberOfTrees = trees.size();
        System.out.println("There are " + numberOfTrees + " trees in the list.");


    }
}
