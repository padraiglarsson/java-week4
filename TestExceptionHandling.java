// Import necessary libraries
import java.util.Arrays;
import java.util.Scanner;

// Define a class named TestExceptionHandling
public class TestExceptionHandling {

    // The main method where the program execution starts
    public static void main(String[] args){

        // Create an array of integers with 10 elements and fill it with random values
        int[] myArray = new int[10];
        for (int i = 0; i < myArray.length; i++)
            myArray[i] = (int) (Math.random() * 100) + 1;

        // Print the random values in the array
        System.out.println("Random values are: " + Arrays.toString(myArray));

        // Create a Scanner object for user input
        Scanner keyboard = new Scanner(System.in);

        // Declare variables for user input and loop control
        String anotherGo;
        int arrayPos, divisor;

        // Start a do-while loop for repeated user input
        do {
            try {
                // Prompt user to enter array position and divisor
                System.out.print("\nEnter an array position >>>");
                arrayPos = Integer.parseInt(keyboard.nextLine());
                System.out.print("Enter a divisor >>>");
                divisor = Integer.parseInt(keyboard.nextLine());

                // Attempt to perform array element modification and handle exceptions
                try {
                    System.out.println("Before: array element at position " + arrayPos +
                            " is " + myArray[arrayPos]);
                    myArray[arrayPos] = myArray[arrayPos] / divisor;
                    System.out.println("After: array element at position " + arrayPos +
                            " is " + myArray[arrayPos]);
                }
                catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Array index out of bounds");
                }
                catch (ArithmeticException e) {
                    System.out.println("You cannot divide by zero");
                }
            }
            catch (Exception e) {
                System.out.println("Error: " + e);
            }

            // Prompt the user for another iteration
            System.out.println("\nAnother go? (y/n)");
            anotherGo = keyboard.nextLine();

        } while (anotherGo.startsWith("y") || anotherGo.startsWith("Y"));
    }
}

