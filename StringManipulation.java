// Import the Scanner class from java.util package for user input
import java.util.Scanner;

// Define a class named StringManipulation
public class StringManipulation {

    // The main method where the program execution starts
    public static void main(String[] args){

        // Prompt the user to input their first name and surname separated by a space
        System.out.println("Please input your first name and surname separated by a space");

        // Create a Scanner object to read user input from the console
        Scanner scan = new Scanner(System.in);

        // Read the entire line of user input into a String variable called fullName
        String fullName = scan.nextLine();

        // Print the first name extracted using the firstName method from the Name class
        System.out.println("First name: " + Name.firstName(fullName));

        // Print the surname extracted using the lastname method from the Name class
        System.out.println("Surname: " + Name.lastname(fullName));

        // Print the short name extracted using the shortName method from the Name class
        System.out.println("Short name: " + Name.shortName(fullName));
    }
}

