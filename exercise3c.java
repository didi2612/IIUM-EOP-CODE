import java.util.Scanner;

public class exercise3c {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Azmi Bin Basharudin || 2211387 \n ");
        // Prompt the user to enter the width of the rectangle
        System.out.print("Enter the width of the rectangle: ");
        double width = input.nextDouble();

        // Prompt the user to enter the height of the rectangle
        System.out.print("Enter the height of the rectangle: ");
        double height = input.nextDouble();

        // Calculate the perimeter, area, and length of the diagonal
        double perimeter = 2 * (width + height);
        double area = width * height;
        double diagonal = Math.sqrt(width * width + height * height);

        // Display the results
        System.out.println("Perimeter of the rectangle: " + perimeter);
        System.out.println("Area of the rectangle: " + area);
        System.out.println("Length of the diagonal: " + diagonal);

        input.close(); // Close the scanner
    }
}
