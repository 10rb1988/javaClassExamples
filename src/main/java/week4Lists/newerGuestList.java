package week4Lists;

import java.util.ArrayList;
import java.util.List;

import static input.InputUtils.stringInput;

public class newerGuestList {
    public static void main(String[] args) {

        // Guestlist list
        List<String> guestList = new ArrayList<>();

        while (true) {
            // menu options
            System.out.println("Guest List Program");
            String menuInput = stringInput("E to ENTER NAME : V to view list : D to delete names : Q to quit");

            // quit option
            if (menuInput.equalsIgnoreCase("q")) {
                break;
            }

            // enter name option
            if (menuInput.equalsIgnoreCase("e")) {
                enterName(guestList);
            }

            // view guestlist option
            if (menuInput.equalsIgnoreCase(("v"))) {
                System.out.println("You have " + guestList.size() + " guests");
                for (String input : guestList) {
                    System.out.println(input);
                }
                System.out.println("\n\n\n");
            }

            // delete guests
            if (menuInput.equalsIgnoreCase("d")) {
                deleteName(guestList);
            }
        }
    }




            // ADD NAMES
    public static List enterName(List<String> guestList) {


            String name = stringInput("Enter a name to add to the list. Enter to return:");
            if (name.isEmpty()) {
                return null;
            }

            else {
                if (containsIgnoreCase(guestList, name)) {
                    System.out.println("That name is already on the list.\n");
                    enterName(guestList);
                    return null;
                }

                guestList.add(name);
                System.out.println(name + " has been added to the list \n\n");
                return guestList;
            }
    }




    // DELETE NAME FUNCTION

    public static List deleteName(List<String> guestList) {
        System.out.println("Delete a name from the list");

        for (int x = 0 ; x < guestList.size() ; x++) {
            String guestNames = guestList.get(x);

            System.out.printf("Number: %d      Guest: %s\n", x, guestNames);
        }

        while (true) {
            String guestDelete = stringInput("Type name of guest to delete. Enter to return");
            if (guestDelete.isEmpty()) {
                break;
            }
            else {
                if (guestList.contains(guestDelete)) {
                    System.out.println(guestDelete + " has been deleted");
                    guestList.remove(guestDelete);
                    return guestList;
                }
                else {
                    System.out.println(guestDelete + " is not on the list");
                    break;
                }
            }
        }
            return null;
    }





            // Is name already on list?
    public static boolean containsIgnoreCase(List<String> list, String data) {

        for(String item: list) {
            if (item.equalsIgnoreCase(data)) {
                return true;
            }
        }
        return false;
    }
}
