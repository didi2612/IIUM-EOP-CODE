import java.util.Scanner;

public class grades {

    // AZMI BIN BASHARUDIN 2211387
    // MUHAMMAD HAIKAL BIN SHAMSURI 2215913
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Please enter the number of students: ");
        int numStudents = obj.nextInt();

        int[] scores = new int[numStudents];

        
        for (int i = 0; i < scores.length; i++) {
            System.out.print("Please enter a score for student " + (i + 1) + ": ");
            scores[i] = obj.nextInt();
        }

        
        int bestScore = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > bestScore) {
                bestScore = scores[i];
            }
        }

        
        for (int i = 0; i < scores.length; i++) {
            char grade;
            if (scores[i] >= bestScore - 10) {
                grade = 'A';
            } else if (scores[i] >= bestScore - 20) {
                grade = 'B';
            } else if (scores[i] >= bestScore - 30) {
                grade = 'C';
            } else if (scores[i] >= bestScore - 40) {
                grade = 'D';
            } else {
                grade = 'F';
            }
            System.out.println("Student " + (i + 1) + " score is " + scores[i] + " and grade is " + grade);
        }
        obj.close();
    }
}
