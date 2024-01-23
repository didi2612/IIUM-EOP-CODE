import java.util.Scanner;

public class exer3a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        String binaryNum = scanner.nextLine();

        int decimalNum = Integer.parseInt(binaryNum, 2);
        System.out.println("The decimal value is: " + decimalNum);
    }
}
