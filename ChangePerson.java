public class ChangePerson {
    public static void main(String[] args){
        // Create two Person objects with initial values
        Person p1 = new Person("Sally", 18);
        Person p2 = new Person("Sam", 22);

        // Initialize an int variable 'age' and a String variable 'name'
        int age = 31;
        String name = "Jill";

        // Print the original values of Person objects, age, and name
        System.out.println("\nParameter Passing... Original values...");
        System.out.println("person1: " + p1);
        System.out.println("person2: " + p2);
        System.out.println("age: " + age + "\tname: " + name + "\n");

        // Call the editPerson method to modify the values
        editPerson(p1, p2, age, name);

        // Print the values after calling editPerson method
        System.out.println("\nValues after calling editPerson...");
        System.out.println("person1: " + p1);
        System.out.println("person2: " + p2);
        System.out.println("age: " + age + "\tname: " + name + "\n");
    }

    // Method to edit Person objects and variables
    public static void editPerson(Person p1, Person p2, int age, String name){
        // Print the original parameters
        System.out.println("\nInside editPerson... Original parameters...");
        System.out.println("Person1: " + p1);
        System.out.println("Person2: " + p2);
        System.out.println("age: " + age + "\tname: " + name + "\n");

        // Create a new Person object with the provided name and age
        Person p3 = new Person(name, age);

        // Update the reference of p2 to the new Person object p3
        p2 = p3;

        // Update the values of 'name' and 'age'
        name = "Jack";
        age = 25;

        // Set the age of p1 and the name of p2 using setter methods
        p1.setAge(age);
        p2.setName(name);

        // Print the changed values
        System.out.println("\nInside editPerson... Changed values...");
        System.out.println("person1: " + p1);
        System.out.println("person2: " + p2);
        System.out.println("age: " + age + "\tname: " + name + "\n");
    }
}
