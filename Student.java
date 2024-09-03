// Import the Scanner class from java.util package for user input
import java.util.Scanner;

// Define a class named Student
public class Student {
    // Declare instance variables for student name, test scores
    String name;
    int test1;
    int test2;

    // Constructor to initialize a student with a name and default test scores
    public Student(String studentName){
        name = studentName;
        test1 = 0;
        test2 = 0;
    }

    // Method to input test scores for the student
    public void inputGrades(){
        Scanner scan = new Scanner(System.in);

        // Prompt user to input test1 score for the student
        System.out.print("Enter " + name + "'s score for test 1: ");
        test1 = scan.nextInt();

        // Prompt user to input test2 score for the student
        System.out.print("Enter " + name + "'s score for test 2: ");
        test2 = scan.nextInt();
    }

    // Method to calculate and return the average of the test scores
    public double getAverage(){
        return (double)(test1 + test2) / 2;
    }

    // Method to get the name of the student
    public String getName(){
        return name;
    }

    // Override the toString method to provide a custom string representation of the student
    public String toString() {
        return "Name: " + name + " Test1: " + test1 + " Test2: " + test2;
    }
}

