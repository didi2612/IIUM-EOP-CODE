import java.util.Scanner;

public class exer1 {
    public static int[] locateSmallest(double[][] a) {
        int[] result = {0, 0};
        double smallest = a[0][0];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] < smallest) {
                    smallest = a[i][j];
                    result[0] = i;
                    result[1] = j;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows and columns of the array: ");
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();

        double[][] array = new double[rows][columns];

        System.out.println("Enter the array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = scanner.nextDouble();
            }
        }

        int[] location = locateSmallest(array);
        System.out.println("The location of the smallest element is at (" + location[0] + ", " + location[1] + ")");
    }
}
