import java.util.Scanner;

public class SmallestNumberIndex {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter 10 integers
        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter integer #" + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Find the index of the smallest number
        int smallestIndex = findSmallestIndex(numbers);

        // Display the index of the smallest number
        System.out.println("Index of the smallest number: " + smallestIndex);

        // Close the scanner
        scanner.close();
    }

    private static int findSmallestIndex(int[] numbers) {
        int smallestIndex = 0;

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < numbers[smallestIndex]) {
                smallestIndex = i;
            }
        }

        return smallestIndex;
    }
}
