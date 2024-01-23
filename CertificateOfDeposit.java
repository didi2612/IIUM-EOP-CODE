import java.util.Scanner;

public class CertificateOfDeposit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter savings amount: ");
        double savingsAmount = scanner.nextDouble();

        System.out.print("Enter annual interest rate in percentage: ");
        double yearlyRate = scanner.nextDouble();

        System.out.print("Enter number of months: ");
        int numMonths = scanner.nextInt();

        
        System.out.println("Month\tCD Value");

       
        for (int month = 1; month <= numMonths; month++) {
            
            double monthlyRate = yearlyRate / 12 / 100;
            double cdValue = savingsAmount * Math.pow(1 + monthlyRate, month);
            System.out.printf("%d\t%.2f%n", month, cdValue);
        }

        scanner.close();
    }
}
