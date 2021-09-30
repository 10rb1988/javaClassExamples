package week4Lists;

import java.util.ArrayList;
import java.util.List;

public class loopingList {
    public static void main(String[] args) {

        List<String> className = new ArrayList<>();
        className.add("Programming Logic");
        className.add("Web Client Server");
        className.add("Project Management");
        className.add("Infotech Concepts");

        // enhanced for loop PREFERRED
        for (String name: className) {
            System.out.println(name);
        }

        // IS THE SAME AS

        for (int i = 0 ; i < className.size() ; i++) {
            System.out.println(className.get(i));
        }

        // modifying array list in loop is safest with a WHILE loop
        while (!className.isEmpty()) {
            String name = className.remove(0);
            System.out.println(name);
        }
     }
}
