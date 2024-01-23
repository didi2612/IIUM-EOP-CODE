import java.util.Scanner;

public class StatisticsCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10];
        
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = input.nextDouble();
        }
        
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        double mean = sum / 10;
        System.out.println("The mean is " + mean);
        
        double deviationSum = 0;
        for (double num : numbers) {
            deviationSum += Math.pow(num - mean, 2);
        }
        double variance = deviationSum / 10;
        double standardDeviation = Math.sqrt(variance);
        System.out.println("The standard deviation is " + standardDeviation);
    }
}