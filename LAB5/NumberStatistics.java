import java.util.Scanner;

public class NumberStatistics {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter 10 integers
        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter integer #" + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Calculate and display the sum of all integers
        int sum = calculateSum(numbers);
        System.out.println("Sum of all integers: " + sum);

        // Calculate and display the average of all numbers
        double average = calculateAverage(numbers);
        System.out.println("Average of all numbers: " + average);

        // Display whether each number is greater than, equal to, or less than the average
        for (int number : numbers) {
            String comparisonResult = compareNumberToAverage(number, average);
            System.out.println(number + " is " + comparisonResult + " the average.");
        }

        // Close the scanner
        scanner.close();
    }

    private static int calculateSum(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    private static double calculateAverage(int[] numbers) {
        int sum = calculateSum(numbers);
        return (double) sum / numbers.length;
    }

    private static String compareNumberToAverage(int number, double average) {
        if (number > average) {
            return "greater than";
        } else if (number < average) {
            return "less than";
        } else {
            return "equal to";
        }
    }
}
