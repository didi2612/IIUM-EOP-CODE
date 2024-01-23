import java.util.Scanner;

public class StandardDeviationCalculator {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter 10 numbers
        System.out.print("Enter 10 numbers separated by spaces: ");
        double[] numbers = new double[10];

        // Read the input numbers
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextDouble();
        }

        // Calculate the mean and standard deviation
        double meanValue = mean(numbers);
        double deviationValue = deviation(numbers);

        // Display the results
        System.out.printf("The mean is %.2f%n", meanValue);
        System.out.printf("The standard deviation is %.5f%n", deviationValue);

        // Close the scanner
        scanner.close();
    }

    /** Compute the mean of double values **/
    public static double mean(double[] x) {
        double sum = 0;

        for (double num : x) {
            sum += num;
        }

        return sum / x.length;
    }

    /** Compute the deviation of double values **/
    public static double deviation(double[] x) {
        double meanValue = mean(x);
        double sumSquaredDiff = 0;

        for (double num : x) {
            sumSquaredDiff += Math.pow(num - meanValue, 2);
        }

        return Math.sqrt(sumSquaredDiff / (x.length - 1));
    }
}
