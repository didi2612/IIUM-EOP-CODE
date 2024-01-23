import java.util.Scanner;

public class string {
    static void passwordgenerator(){
        System.out.print("----- PASSWORD GENERATOR -----");
        

    }
     static void BMIcalculator(){
        System.out.print("---- BMI CALCULATOR ");
    }
    public static void main(String[] args){
    Scanner obj = new Scanner(System.in);
    String password = "Aisyah",success = "Login Successful !",failed = "Login Failed",realuser = "AZMI Basharudin",system = obj.nextLine();

    System.out.print("Please enter your username : ");
    String user = obj.nextLine();
    if (user.toLowerCase().equals(realuser.toLowerCase())){
        System.out.print("Please enter your password :");
        String formpass = obj.nextLine();
           if (formpass.toLowerCase().equals(password.toLowerCase())){
                  System.out.print(success);
                  System.out.print("active user : " + realuser);
                  System.out.print("Password : ***********");
                  System.out.print("What system are you planning to use ?");
                  switch(system){
                    case "A" :
                        BMIcalculator();
                    case "B" :
                        passwordgenerator();

                  }
                

             }
    
             else{
                 System.out.print(failed);
             }
    }
    else{
        System.out.print(failed);
    }
     obj.close();
    }
}
