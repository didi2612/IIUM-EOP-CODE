import java.util.Scanner;

public class NumberCounter {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Initialize an array to store occurrences of each number (1 to 50)
        int[] occurrences = new int[50];

        // Prompt the user to enter integers between 1 and 50, ending with 0
        System.out.println("Enter integers between 1 and 50 (enter 0 to end):");

        int number;
        do {
            System.out.print("Enter an integer: ");
            number = scanner.nextInt();

            // Check if the entered number is within the valid range
            if (number >= 1 && number <= 50) {
                // Increment the count for the entered number
                occurrences[number - 1]++;
            } else if (number != 0) {
                System.out.println("Invalid input. Please enter a number between 1 and 50.");
            }

        } while (number != 0);

        // Display the occurrences of each number
        System.out.println("\nOccurrences:");

        for (int i = 0; i < occurrences.length; i++) {
            if (occurrences[i] > 0) {
                System.out.println("Number " + (i + 1) + ": " + occurrences[i] + " times");
            }
        }

        // Close the scanner
        scanner.close();
    }
}
