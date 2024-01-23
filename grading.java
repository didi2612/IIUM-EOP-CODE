import java.util.Scanner;

public class grading {
    public static void main(String[] args) {
        char[] correctAnswers = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        for (int studentNumber = 1; studentNumber <= numberOfStudents; studentNumber++) {
            char[] studentAnswers = getStudentAnswers(studentNumber);
            int score = gradeTest(correctAnswers, studentAnswers);
            System.out.println("Score for Student " + studentNumber + ": " + score + "/" + correctAnswers.length);
        }

        scanner.close();
    }

    private static char[] getStudentAnswers(int studentNumber) {
        Scanner scanner = new Scanner(System.in);
        char[] studentAnswers = new char[10];

        System.out.println("\nEnter answers for Student " + studentNumber + ":");
        for (int i = 0; i < studentAnswers.length; i++) {
            System.out.print("Question " + (i + 1) + ": ");
            studentAnswers[i] = scanner.next().toUpperCase().charAt(0);
        }
        
        return studentAnswers;
    }

    private static int gradeTest(char[] correctAnswers, char[] studentAnswers) {
        int score = 0;

        for (int i = 0; i < correctAnswers.length; i++) {
            if (correctAnswers[i] == studentAnswers[i]) {
                score++;
            }
        }

        return score;
    }
}
