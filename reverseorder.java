import java.util.Arrays;
import java.util.Scanner;

public class reverseorder {
    public static void main(String[] args) {
    // AZMI BIN BASHARUDIN 2211387
    // MUHAMMAD HAIKAL BIN SHAMSURI 2215913

        Scanner obj = new Scanner(System.in);

        int[] integers = new int[10];

        System.out.println("Enter ten integers:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter an integer: ");
            integers[i] = obj.nextInt();
        }

        
        int[] original = Arrays.copyOf(integers, integers.length);

        System.out.println("\nOriginal Integers:");
        for (int i = 0; i < 10; i++) {
            System.out.print(original[i] + " ");
        }

        System.out.println("\nIntegers in reverse order:");
        for (int i = 9; i >= 0; i--) {
            System.out.print(integers[i] + " ");
        }

        obj.close();
    }
}
