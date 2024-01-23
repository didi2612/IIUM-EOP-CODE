import java.util.Scanner;

public class FutureDayCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        System.out.print("Enter today's day (0 - 6): ");
        int today = input.nextInt();

        System.out.print("Enter the number of days elapsed since today: ");
        int futureDay = input.nextInt();

        int futureDayIndex = (today + futureDay) % 7;

        System.out.println("Today is " + daysOfWeek[today] + " and the future day is " + daysOfWeek[futureDayIndex]);
    }
}