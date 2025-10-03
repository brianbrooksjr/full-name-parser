package com.pluralsight;

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


    }
}
