import java.util.Scanner;

public class PassOrFail {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int score;

        while (true) {
            System.out.print("Enter your score: ");
            score = input.nextInt();

            if (score == -1) {
                System.out.println("Ending program");
                break;
            } else if (score >= 60) {
                System.out.println("You pass the exam.");
            } else {
                System.out.println("You don't pass the exam.");
            }
        }
    }
}