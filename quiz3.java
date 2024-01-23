import java.util.ArrayList;

public class quiz3 {

    public static void main(String[] args) {
        double[][] weeklyHumidity = {
                {0.92, 0.94, 0.82, 0.72, 0.76, 0.85, 0.99},
                {0.93, 0.84, 0.81, 0.72, 0.96, 0.95, 0.91},
                {0.83, 0.91, 0.90, 0.76, 0.72, 0.81, 0.97},
                {0.82, 0.93, 0.98, 0.72, 0.86, 0.81, 0.84},
                {0.76, 0.74, 0.81, 0.92, 0.96, 0.85, 0.88}
        };
        for (int i = 0; i < weeklyHumidity.length; i++) {
            System.out.print("week " + (i+1) + ": \n");
            for (int j = 0; j < weeklyHumidity[i].length; j++){
                System.out.print("Day " + (j+1) + ": ");
                System.out.print(weeklyHumidity[i][j]);
                System.out.print("\n");
            }
       }
        ArrayList<Double> avgHumidity = getAvgHumidity(weeklyHumidity);
        printHumidity(avgHumidity);
         
}

    public static ArrayList<Double> getAvgHumidity(double[][] weeklyHumidity) {
        ArrayList<Double> avgHumidity = new ArrayList<>();

        for (int i = 0; i < weeklyHumidity.length; i++) {
            double sum = 0;
            for (int j = 0; j < weeklyHumidity[i].length; j++) {
                sum += weeklyHumidity[i][j];
            }
            avgHumidity.add(sum / weeklyHumidity[i].length);
        }

        return avgHumidity;
    }

    public static void printHumidity(ArrayList<Double> avgHumidity) {
        System.out.println("Weekly Average Humidity for City A:");
        for (int i = 0; i < avgHumidity.size(); i++) {
            System.out.println("Week " + (i + 1) + ": " + avgHumidity.get(i));
        }
    }
}