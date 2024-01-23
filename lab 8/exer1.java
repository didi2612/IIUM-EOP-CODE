import java.util.InputMismatchException;
import java.util.Scanner;

public class exer1 {
    public static void main(String[] args) {
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        int[] dom = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter an integer between 1 and 12: ");
            int monthNumber = scanner.nextInt();

            if (monthNumber < 1 || monthNumber > 12) {
                throw new ArrayIndexOutOfBoundsException("Wrong Number");
            }

            System.out.println("Month: " + months[monthNumber - 1]);
            System.out.println("Days: " + dom[monthNumber - 1]);
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Wrong Number");
        }
    }
}
