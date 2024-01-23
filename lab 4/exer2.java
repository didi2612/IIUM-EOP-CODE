import java.util.Scanner;

public class exer2 {
    public static double areaPentagon(double side) {
        return (5 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / 5));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the side of the pentagon: ");
        double side = scanner.nextDouble();

        double area = areaPentagon(side);
        System.out.println("The area of the pentagon is: " + area);
    }
}
