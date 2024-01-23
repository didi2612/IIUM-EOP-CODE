public class exer2 {
    public static void main(String[] args) {
        int[][] matrix = {
                {2, 4, 3, 5},
                {6, 8, 2, 4},
                {3, 5, 7, 1},
                {1, 9, 4, 6}
        };

        System.out.println("Maximum value in the primary diagonal: " + maxPrimaryDiagonal(matrix));
        System.out.println("Minimum value in the secondary diagonal: " + minSecondaryDiagonal(matrix));
        System.out.println("Sum of values above the primary diagonal: " + sumAbovePrimaryDiagonal(matrix));
        System.out.println("Sum of values below the primary diagonal: " + sumBelowPrimaryDiagonal(matrix));
    }

    public static int maxPrimaryDiagonal(int[][] matrix) {
        int max = matrix[0][0];
        for (int i = 1; i < matrix.length; i++) {
            if (matrix[i][i] > max) {
                max = matrix[i][i];
            }
        }
        return max;
    }

    public static int minSecondaryDiagonal(int[][] matrix) {
        int min = matrix[0][matrix.length - 1];
        for (int i = 1; i < matrix.length; i++) {
            if (matrix[i][matrix.length - 1 - i] < min) {
                min = matrix[i][matrix.length - 1 - i];
            }
        }
        return min;
    }

    public static int sumAbovePrimaryDiagonal(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }
        return sum;
    }

    public static int sumBelowPrimaryDiagonal(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < i; j++) {
                sum += matrix[i][j];
            }
        }
        return sum;
    }
}
