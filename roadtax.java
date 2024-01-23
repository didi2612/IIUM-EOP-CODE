import java.util.Scanner;

// AZMI BIN BASHARUDIN ( 2211387 ) ** MUHAMMAD HAIKAL BIN SHAMSURI ( 2215913 )
public class roadtax {
    public static void main(String[] args) {
        Scanner didi = new Scanner(System.in);

        int taxFee = 0;
        System.out.print("Please select your car type : \n 1. Saloon \n 2. Non-Saloon \n -> ");
        int carType = didi.nextInt();
        switch (carType) {
            case 1:
                System.out.print("Please enter your car cc : ");
                int cc = didi.nextInt();
                if (cc <= 1000) {
                    taxFee = 20;
                } else if (cc > 1000 && cc < 1201) {
                    taxFee = 55;
                } else if (cc > 1200 && cc < 1401) {
                    taxFee = 70;
                } else if (cc > 1400 && cc < 1601) {
                    taxFee = 90;
                }
                break;
            case 2:
                System.out.print("Please enter your car cc : ");
                int cc2 = didi.nextInt();
                if (cc2 > 1600 && cc2 < 1801) {
                    taxFee = 200;
                } else if (cc2 > 1800 && cc2 < 2001) {
                    taxFee = 280;
                } else if (cc2 > 2000 && cc2 < 2501) {
                    taxFee = 380;
                } else if (cc2 > 2500 && cc2 < 3001) {
                    taxFee = 880;
                } else if (cc2 > 3000) {
                    taxFee = 2130;
                }
                break;
            default:
                break;
        }

        System.out.print("Your road tax fee is : RM " + taxFee);

        didi.close();
    }
}