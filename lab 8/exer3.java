import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class exer3 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("students.txt"))) {
            String line;
            String highestScorer = "";
            int highestScore = Integer.MIN_VALUE;

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(" ");
                String studentName = parts[0];
                int studentScore = Integer.parseInt(parts[1]);

                if (studentScore > highestScore) {
                    highestScore = studentScore;
                    highestScorer = studentName;
                }
            }

            System.out.println("Student who scored the highest is " + highestScorer);
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
    }
}
