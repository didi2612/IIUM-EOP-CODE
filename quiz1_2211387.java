import java.util.Scanner;

public class quiz1_2211387 {
    public static void main(String[] args) {
      Scanner azmi = new Scanner(System.in);
      System.out.println("AZMI BIN BASHARUDIN || 2211387 || QUIZ 1 ");
      System.out.print("Please enter your friction force in Newtons : ");
      double f = azmi.nextDouble();
      System.out.print("Please enter the object mass in kg: ");
      double m = azmi.nextDouble();
      System.out.print("Please enter the object acceleration in m/s^2 : ");
      double a = azmi.nextDouble();
    
      double g = 9.8;

      double u = (f - m * a) / (m * g);
    
      System.out.print("The coefficient for friction is " + u);

      azmi.close();

    }
}
