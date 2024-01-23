import java.util.Scanner;

public class casestudy2 {
    public static void main(String[] args) {
        Scanner azmi = new Scanner(System.in);
        System.out.print("Are you undergraduate ? (Yes / No ) : ");
        String ans = azmi.nextLine();
        int fees = 0;
        if(ans.equalsIgnoreCase("No")){
           fees = 8000;
        }
        else if (ans.equalsIgnoreCase("Yes")){
        System.out.print("Are you science & tech student ? ( yes / no ) : ");
        String subject = azmi.nextLine();
            if(subject.equalsIgnoreCase("Yes")){
                fees = 6500;
            }
            else if(subject.equalsIgnoreCase("No")){
                fees = 5500;
            }
        }
        System.out.print("Your fees will be RM " + fees );
        azmi.close();
    }
}