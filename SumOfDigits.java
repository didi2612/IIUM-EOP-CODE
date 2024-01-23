import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        while (true) {
            System.out.print("Enter an integer number: ");
            int number = input.nextInt();
            
            if (number == -1) {
                System.out.println("Ending program");
                break;
            }
            
            int sum = 0;
            int temp = number;
            
            while (temp != 0) {
                sum += temp % 10;
                temp /= 10;
            }
            
            System.out.println("The sum of the total individual digits is " + sum);
        }
    }
}