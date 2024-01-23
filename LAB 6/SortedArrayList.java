import java.util.Scanner;

public class SortedArrayList {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of integers
        System.out.print("Enter the number of integers: ");
        int size = scanner.nextInt();

        // Prompt the user to enter the list of integers
        System.out.print("Enter list of integers: ");
        int[] list = new int[size];

        for (int i = 0; i < size; i++) {
            list[i] = scanner.nextInt();
        }

        // Check if the list is sorted and display the result
        if (isSorted(list)) {
            System.out.println("The list is sorted.");
        } else {
            System.out.println("The list is not sorted.");
        }

        // Close the scanner
        scanner.close();
    }

    /** Check if the array list is sorted in ascending order **/
    public static boolean isSorted(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            if (list[i] > list[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
