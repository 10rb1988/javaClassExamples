package week4Lists;

import java.util.ArrayList;
import java.util.List;

import static input.InputUtils.stringInput;

public class userInputLists {
    public static void main(String[] args) {

        List<String> todoList = new ArrayList<>();

        while (true) {
            String data = stringInput("Please type a task you need to do, or enter to quit");
            if (data.length() == 0) { // If user just presses enter, length is zero so break
                break;

        }
            if (containsIgnoreCase(todoList, data)) {
                System.out.println("Sorry, that's already in the list");

            }
            else {
            todoList.add(data);
            }}
        System.out.println("You have " + todoList.size() + " tasks.");
        System.out.println("Thanks, here are the tasks you entered:");

        for (String input : todoList) {
            System.out.println(input);
        }
}
        // Do not declare list type in the method
        public static boolean containsIgnoreCase(List<String> list, String data) {

        for(String item: list) {
            if (item.equalsIgnoreCase(data)) {
                return true;
            }
        }
        return false;
        }
}
