import java.util.Scanner;

public class exer3b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a decimal number (non-negative): ");
        int decimalNum = scanner.nextInt();

        String binaryNum = Integer.toBinaryString(decimalNum);
        System.out.println("The binary value is: " + binaryNum);
    }
}
