// Define a class named Grades
public class Grades {

    // The main method where the program execution starts
    public static void main(String[] args){

        // Create two Student objects with names "Mary" and "Mike"
        Student student1 = new Student("Mary");
        Student student2 = new Student("Mike");

        // Prompt user input for grades for student1
        student1.inputGrades();

        // Print the average grade for student1
        System.out.println("The average for " + student1.getName()
                + " is " + student1.getAverage() + ".");
        System.out.println();

        // Prompt user input for grades for student2
        student2.inputGrades();

        // Print the average grade for student2
        System.out.println("The average for " + student2.getName()
                + " is " + student2.getAverage() + ".");
        System.out.println();

        // Print information about both students
        System.out.println("Student 1: " + student1);
        System.out.println("Student 2: " + student2);
        System.out.println();
    }
}

