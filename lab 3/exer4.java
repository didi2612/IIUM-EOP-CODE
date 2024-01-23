import java.util.Scanner;

public class exer4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        String first9Digits = scanner.nextLine();

        int checksum = 0;
        for (int i = 0; i < 9; i++) {
            int digit = Character.getNumericValue(first9Digits.charAt(i));
            checksum += (i + 1) * digit;
        }

        checksum %= 11;

        String isbn10;
        if (checksum == 10) {
            isbn10 = first9Digits + "X";
        } else {
            isbn10 = first9Digits + checksum;
        }

        System.out.println("The ISBN-10 number is: " + isbn10);
    }
}
