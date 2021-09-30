package week4Lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class collectionSchoolNames {
    public static void main(String[] args) {
        List<String> classNames = new ArrayList<>();

        classNames.add("Programming Logic");
        classNames.add("Web Client Server");
        classNames.add("Project Management");
        classNames.add("Info Tech Concepts");

        Collections.sort(classNames);
        
        String alphabeticalFirst = Collections.min(classNames);
        System.out.println(classNames);
        System.out.println(alphabeticalFirst);
    }
}
