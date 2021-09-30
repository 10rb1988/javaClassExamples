package week4Lists;

import java.util.ArrayList;
import java.util.List;

public class removeFromArray {
    public static void main(String[] args) {

        List<String> className = new ArrayList<>();
        className.add("Programming Logic");
        className.add("Web Client Server");
        className.add("Project Management");
        className.add("Infotech Concepts");

        System.out.println(className);

        className.remove("Project Management");
        System.out.println(className);

        className.remove(0); // int primitive type

        // modify element in list
        className.set(0, "Systems Analysis");

        // classname.contains("data")

        // classnames.size

        // classnames.clear EMPTY LIST
        // classnames.isEmpty
    }
}
