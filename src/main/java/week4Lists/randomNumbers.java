package week4Lists;

import java.util.Random;

public class randomNumbers {
    public static void main(String[] args) {

        Random rnd = new Random();
        int randomNumber = rnd.nextInt(10); // 0-9
        int randomNumberBtwn1n10 = rnd.nextInt(10) +1;

        System.out.println(randomNumber + "  " + randomNumberBtwn1n10);

    }
}
