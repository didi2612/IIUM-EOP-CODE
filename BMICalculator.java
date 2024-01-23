import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();

        System.out.print("Enter height in inches: ");
        double inches = input.nextDouble();

        double weightInKilos = weight * 0.45359237;
        double heightInMeters = inches * 0.0254;

        double BMI = weightInKilos / (heightInMeters * heightInMeters);
        System.out.println("BMI is " + BMI);

        if (BMI < 18.5) {
            System.out.println("You are underweight");
        } else if (BMI < 25.0) {
            System.out.println("You have a normal weight");
        } else if (BMI < 30.0) {
            System.out.println("You are overweight");
        } else {
            System.out.println("You are obese");
        }
    }
}