package week4Lists;

import java.util.ArrayList;
import java.util.List;

import static input.InputUtils.intInput;
import static input.InputUtils.stringInput;


public class guestListProgram {
    public static void main(String[] args) {

        List<String> guestList = new ArrayList<>();

        System.out.println("Guest list program: ");

        while (true) {

            String data = stringInput("Enter a Guest name / V to view list/ D to delete a guest / Q to quit");

            // QUIT THE PROGRAM
            if ( data.equalsIgnoreCase("Q") ) {
                break;
            }

            // DELETE A GUEST
            if (data.equalsIgnoreCase("D")) {
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
                        System.out.println(guestDelete + " has been deleted");
                        guestList.remove(guestDelete);
                    }


                }
            }

            // VIEW GUEST LIST
            if (data.equalsIgnoreCase("v")) {
                System.out.println("You have " + guestList.size() + " guests");
                for (String input : guestList) {
                    System.out.println(input);
                }
            }
            // ENSURE NO DUPLICATES
            if (containsIgnoreCase(guestList, data)) {
                System.out.println("That name is already on the list");
            }

            // ADD A GUEST
            if (!data.equalsIgnoreCase()) {
                guestList.add(data);
            }



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


        public static String addGuests(List<String> list, String data) {

            if (!data.equalsIgnoreCase()) {
                list.add(data);
            }

        }

}

//todo WORK OUT WHY PROGRAM IS LOOPING WEIRD ADDS MENU OPTION TO LIST
// Maybe just rewrite with functions