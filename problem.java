import java.util.Scanner;

public class problem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first positive integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second positive integer: ");
        int num2 = scanner.nextInt();

        int minNum = Math.min(num1, num2);

        for (int k = minNum; k > 0; k--) {
            if (num1 % k == 0 && num2 % k == 0) {
                System.out.println("The greatest common divisor of " + num1 + " and " + num2 + " is: " + k);
                break;  
            }
        }

        scanner.close();
    }
}
