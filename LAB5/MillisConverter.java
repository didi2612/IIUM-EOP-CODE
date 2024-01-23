import java.util.Scanner;

public class MillisConverter {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter milliseconds
        System.out.print("Enter a long integer for milliseconds: ");
        long millis = scanner.nextLong();

        // Call the convertMillis method and display the result
        String result = convertMillis(millis);
        System.out.println("Converted time: " + result);

        // Close the scanner
        scanner.close();
    }

    public static String convertMillis(long millis) {
        // Calculate hours, minutes, and seconds
        long totalSeconds = millis / 1000;
        long seconds = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long minutes = totalMinutes % 60;
        long hours = totalMinutes / 60;

        // Create a string in the format of hours:minutes:seconds
        return hours + ":" + minutes + ":" + seconds;
    }
}
