import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter type of input to check (S for string, I for integer, B for binary): ");
        char inputType = scanner.next().charAt(0);

        int length;
        boolean isPalindrome = true;

        switch (inputType) {
            case 'S':
                System.out.print("Enter string: ");
                String strInput = scanner.next();
                length = strInput.length();
                for (int i = 0; i < length / 2; i++) {
                    if (strInput.charAt(i) != strInput.charAt(length - 1 - i)) {
                        isPalindrome = false;
                        break;
                    }
                }
                System.out.println("This is a " + length + " letter " + (isPalindrome ? "" : "non-") + "palindrome");
                break;

            case 'I':
                System.out.print("Enter integer: ");
                int intInput = scanner.nextInt();
                String intStr = Integer.toString(intInput);
                length = intStr.length();
                for (int i = 0; i < length / 2; i++) {
                    if (intStr.charAt(i) != intStr.charAt(length - 1 - i)) {
                        isPalindrome = false;
                        break;
                    }
                }
                System.out.println("This is a " + length + " integer " + (isPalindrome ? "" : "non-") + "palindrome");
                break;

            case 'B':
                System.out.print("Enter binary: ");
                String binaryInput = scanner.next();
                length = binaryInput.length();
                for (int i = 0; i < length / 2; i++) {
                    if (binaryInput.charAt(i) != binaryInput.charAt(length - 1 - i)) {
                        isPalindrome = false;
                        break;
                    }
                }
                System.out.println("This is a " + length + " binary " + (isPalindrome ? "" : "non-") + "palindrome");
                break;

            default:
                System.out.println("Invalid input type.");
        }
        scanner.close();
    }
}
