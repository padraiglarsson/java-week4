// Define a class named Person
public class Person {

    // Private instance variables for the person's name and age
    private String name;
    private int age;

    // Constructor to initialize the Person object with a name and age
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    // Setter method to update the person's name
    public void setName(String newName){
        name = newName;
    }

    // Setter method to update the person's age
    public void setAge(int newAge){
        age = newAge;
    }

    // Override the toString method to provide a custom string representation of the object
    public String toString(){
        // Return a string containing the person's name and age
        return name + " - Age " + age;
    }
}

