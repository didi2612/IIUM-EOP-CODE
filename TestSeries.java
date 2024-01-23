class Series {
    
    static double computeSeries(int k) {
        double result = 0;
        for (int i = 1; i <= k; i++) {
            result += Math.pow(-1, i - 1) * (i * 1.0 / (i + 1));
        }
        return result;
    }
}
class AZMI {
    static void printing() {
        System.out.println("AZMI BIN BASHARUDIN || 2211387");
        System.out.println("QUIZ 2 EOP");
        System.out.print("\n");
    }

    
}

public class TestSeries {
    public static void main(String[] args) {
        AZMI.printing();
        System.out.printf("%-10s%-15s\n", "k", "Series Value");

        
        for (int k = 1; k <= 10; k++) {
            double result = Series.computeSeries(k);
            System.out.printf("%-10d%-15.5f\n", k, result);
        }
    }
}
