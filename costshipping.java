import java.util.Scanner;


public class costshipping {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        double price = 0;
        System.out.print("Please enter your package weight :");
        double w = obj.nextDouble();

        if(w > 0 && w <= 1){
            price = 3.5;
        }
        else if(w > 1 && w <= 3){
            price = 5.5;
        }
        else if(w > 3 && w <= 10){
            price = 8.5;
        }
        else if(w > 10 && w <= 20){
            price = 10.5;
        }

        System.out.print("Your shipping fee will be : RM " + price );
        obj.close();


    }
}
