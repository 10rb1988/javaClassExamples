package week4Lists;

import java.util.ArrayList;
import java.util.List;

import static input.InputUtils.positiveDoubleInput;

public class speedTest {
    public static void main(String[] args) {

        List<Double> speeds = new ArrayList<>();

        int totalHours = 12;

        // regular for loop as i want to count
        for (int hour = 0 ; hour < totalHours ; hour++) {
            double speed = positiveDoubleInput("Enter the speed for hour " + hour);
            speeds.add(speed);
        }

        System.out.println("All speeds are");
        // printing out in a classic for loop as i want hour PLUS data
        for (int hour = 0 ; hour < speeds.size() ; hour++) {
            double speed = speeds.get(hour);
            System.out.printf("Hour: %d    Speed %.2f\n", hour, speed);
        }


        // remove all zeros use WHILE because we dont want to remove items from a list
        // using a loop THAT DEPENDS ON THE LENGTH OF THE LIST
        while (speeds.contains(0.0)) {
            speeds.remove(0.0);
        }

        // count number of times speed was at zero use enhanced for loop

        int zeroCount = 0;

        for (double speed: speeds) {
            if (speed == 0) {
                zeroCount++;
            }
        }

        // figure out average speed start out with total speed
        double total = 0;
        for (double speed: speeds) {
            total = total + speed;
        }

        double average = total / speeds.size();
        System.out.println("Average speed was " + average);


        System.out.println("Number of times speed was at zero is " + zeroCount);
    }
}
