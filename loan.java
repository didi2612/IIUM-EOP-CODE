import java.util.Scanner;
import java.lang.Math;

public class loan {
    public static void main(String[] args){
        double interest = 2.3/100;

        Scanner obj = new Scanner(System.in);

        System.out.print("Please enter number of loan amount : ");
        int loan = obj.nextInt();
        System.out.print("\n");
        System.out.print("Please enter number of years : ");
        int years = obj.nextInt();
        

        double bottomformula = (1 / (Math.pow(1 + interest, years * 12)));
        double monthlypayment = (loan * interest ) / ( 1 - bottomformula);
        
        System.out.print("Your Monthly Payment is : " + monthlypayment);

        obj.close();



    }
}
