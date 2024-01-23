import java.util.Scanner;

public class GradeAssigner {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the total number of students
        System.out.print("Enter the total number of students: ");
        int totalStudents = scanner.nextInt();

        // Prompt the user to enter all the scores
        int[] scores = new int[totalStudents];
        for (int i = 0; i < totalStudents; i++) {
            System.out.print("Enter the score for student #" + (i + 1) + ": ");
            scores[i] = scanner.nextInt();
        }

        // Find the best score
        int bestScore = findBestScore(scores);

        // Display the grades based on the specified scheme
        System.out.println("\nGrades:");
        for (int i = 0; i < totalStudents; i++) {
            char grade = assignGrade(scores[i], bestScore);
            System.out.println("Student #" + (i + 1) + ": " + grade);
        }

        // Close the scanner
        scanner.close();
    }

    private static int findBestScore(int[] scores) {
        int bestScore = scores[0];

        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > bestScore) {
                bestScore = scores[i];
            }
        }

        return bestScore;
    }

    private static char assignGrade(int score, int bestScore) {
        if (score >= bestScore - 5) {
            return 'A';
        } else if (score >= bestScore - 10) {
            return 'B';
        } else if (score >= bestScore - 15) {
            return 'C';
        } else if (score >= bestScore - 20) {
            return 'D';
        } else {
            return 'F';
        }
    }
}
