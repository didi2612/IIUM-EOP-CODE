import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class exer2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter new text file name: ");
        String fileName = scanner.nextLine();

        try (FileWriter writer = new FileWriter(fileName)) {
            char choice;
            do {
                System.out.print("Enter name and marks of a student: ");
                String input = scanner.nextLine();
                writer.write(input + "\n");

                System.out.print("Continue? (y/n): ");
                choice = scanner.next().charAt(0);
                scanner.nextLine(); // consume the newline character
            } while (choice == 'y' || choice == 'Y');

            System.out.println("Names and marks saved!");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}
