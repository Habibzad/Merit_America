package week4;

/*
 * File: FindLargestAndSecondLargestInt.java
 * --------------------
 * This program asks the user to enter a set of integers 
 * and finds the largest and the second-largest integer.
 */
import java.util.ArrayList;
import acm.program.ConsoleProgram;

public class FindLargestAndSecondLargestInt extends ConsoleProgram {

    private static final int SENTINEL = 0;

    public void run() {
        println("This program takes a list of integers and finds the largest and secondlargest. Inputting 0 stops the program.");
        findSmallestAndLargest();
    }

    private void findSmallestAndLargest() {
        int firstVal = readInt("Enter a number ");
        int largestNumber = firstVal;
        int secondLargestNumber = firstVal;
        int counter = 0;
        if (firstVal == SENTINEL) {
            println("You did not enter a valid value.");
        } else
            counter++;

        while (true) {
            int value = readInt("? ");
            if (value == SENTINEL && counter >= 2) {
                break;
            } else if (value == SENTINEL && counter < 2) {
                println("You must enter at least two non-zero values before ending.");
            }
            if (value > largestNumber) {
                secondLargestNumber = largestNumber;
                largestNumber = value;
            } else if (value <= largestNumber && value > secondLargestNumber) {
                secondLargestNumber = value;
            }
            if (value != 0)
                counter++;
        }
        println("Largest: " + largestNumber);
        println("Second Largest: " + secondLargestNumber);
    }
}
