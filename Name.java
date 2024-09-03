// Define a class named Name
public class Name {

    // Define a constant character for space
    private static final char SPACE = ' ';

    // Method to extract the first name from a full name
    public static String firstName(String name) {
        // Find the index of the first space in the full name
        int spaceIndex = name.indexOf(SPACE);

        // Return the substring from the beginning of the name to the first space (exclusive)
        return name.substring(0, spaceIndex);
    }

    // Method to extract the last name from a full name
    public static String lastname(String name){
        // Find the index of the first space in the full name
        int spaceIndex = name.indexOf(SPACE);

        // Get the length of the full name
        int length = name.length();

        // Return the substring from the character after the first space to the end of the name
        return name.substring(spaceIndex + 1, length);
    }

    // Method to create a short name (first initial and last name) from a full name
    public static String shortName(String name){
        // Create a string with the first initial and a period
        String answer = name.charAt(0) + ". ";

        // Append the last name to the short name
        answer += Name.lastname(name);

        // Return the short name
        return answer;
    }
}

