import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class pairassign2 {
    // AZMI BIN BASHARUDIN 2211387
    // MUHAMMAD HAIKAL BIN SHAMSURI 2215913
    public static void main(String[] args) {
        displayClientInformation("client.txt");
    }

    public static void displayClientInformation(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;

            System.out.printf("%-15s%-20s%-20s%-15s%-15s%-10s%n", "Client ID", "Client Name", "Location", "Event Date", "Category", "Type");
            System.out.println("---------------------------------------------------------------------------------------------");

            int wedCount = 0;

            while ((line = reader.readLine()) != null) {
                String[] data = line.split(" ");

                
                System.out.printf("%-15s%-20s%-20s%-15s%-15s%-10s%n", data[0], data[1] + " " + data[2], data[3], data[4], data[5], data[6]);

                
                if (data.length > 6 && data[6].equals("WED")) {
                    wedCount++;
                }
            }

            System.out.println("\nClients with type of event \"WED\": " + wedCount);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
