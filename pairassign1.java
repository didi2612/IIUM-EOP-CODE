import java.io.*;

public class pairassign1 {

    
    public static void main(String[] args) {

        // AZMI BIN BASHARUDIN 2211387
        // MUHAMMAD HAIKAL BIN SHAMSURI 2215913
        int[][] A = {{-9, 1, 3}, {14, -5, 7}};
        int[][] B = {{1, 2}, {3, 4}, {5, 6}};
        int[][] AB = multMatrix(A, B);
        try {
            FileWriter writer = new FileWriter("matrix.txt");
            for (int i = 0; i < AB.length; i++) {
                for (int j = 0; j < AB[0].length; j++) {
                    writer.write(AB[i][j] + " ");
                }
                writer.write("\n");
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int[][] multMatrix(int[][] A, int[][] B) {
        int m = A.length;
        int n = A[0].length;
        int p = B[0].length;
        int[][] AB = new int[m][p];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                for (int k = 0; k < n; k++) {
                    AB[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return AB;
    }
}
