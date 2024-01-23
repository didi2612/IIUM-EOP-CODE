import java.util.Scanner;

public class classsession {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);

        System.out.print("Please enter your temperature : ");
        double temp = obj.nextDouble();
        System.out.print("\n");

        double newtemp = (5.0 / 9)*(temp - 32);

        System.out.print(newtemp);

        obj.close();



    }
    
}
