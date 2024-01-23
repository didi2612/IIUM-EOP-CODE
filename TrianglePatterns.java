import java.util.Scanner;

public class TrianglePatterns {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a non-negative integer n: ");
        int n = input.nextInt();
        
        // Pattern a
        System.out.println("Pattern a:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        // Pattern b
        System.out.println("Pattern b:");
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}