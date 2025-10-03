import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their name
        System.out.print("Please enter your name: ");
        String fullName = scanner.nextLine().trim();  // Read and trim the input

        // Split the trimmed name by spaces
        String[] nameParts = fullName.split(" ");

        // Variables for first, middle, and last names
        String firstName = "";
        String middleName = "(none)";
        String lastName = "(none)";

        // Assign values based on the number of name parts
        if (nameParts.length >= 1) {
            firstName = nameParts[0];  // First name is always the first part
        }
        if (nameParts.length == 3) {
            middleName = nameParts[1];  // Middle name is the second part
            lastName = nameParts[2];     // Last name is the third part
        } else if (nameParts.length == 2) {
            lastName = nameParts[1];     // Last name is the second part
        }

        // Display the results
        System.out.println("First name: " + firstName);
        System.out.println("Middle name: " + middleName);
        System.out.println("Last name: " + lastName);

        // Close the scanner
        scanner.close();
    }
}
