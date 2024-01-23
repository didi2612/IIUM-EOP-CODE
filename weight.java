import java.util.Scanner;


public class weight {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Please enter your weight :");
        double weight = obj.nextDouble();
        System.out.print("Please enter your height :");
        double height = obj.nextDouble();
        double newheight = height / 100;
        double BMI = weight / (newheight * newheight);
        
        if (BMI < 18.5){
                System.out.print("NOOOB UNDERWEIGHT ! EAT SOMETHING BRO");
        }
        else if (BMI <= 18.5 || BMI < 25.0){
                System.out.print("OKAY AH NORMAL");
        }
        else if (BMI < 30.0){
                System.out.print("NI PALING GEMUK WAKNAT");
        }
        else if (BMI <= 25.0 || BMI < 30.0){
                System.out.print("GEMUK WAKNAT");
        }
obj.close();
    } 
}
