import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class PetrolStation {
    private double[] petrolLevels;
    private double[] fuelPrices;
    private final double MIN_PETROL_LEVEL = 0.1;
    private int receiptNumber = 1;

    public PetrolStation(int numDispensers) {
        petrolLevels = new double[numDispensers];
        fuelPrices = new double[numDispensers];
        updateFuelPrices();
        for (int i = 0; i < numDispensers; i++) {
            petrolLevels[i] = 100.0;
        }
    }

    public void purchaseFuel(int dispenser, double amount, String fuelType) {
        updateFuelPrices();
        if (dispenser < 0 || dispenser >= petrolLevels.length) {
            System.out.println("Invalid dispenser. Please try again.");
            return;
        }

        if (petrolLevels[dispenser] < MIN_PETROL_LEVEL) {
            System.out.println("Warning: Low petrol level at dispenser " + dispenser + ". Please top up more fuel.");
        } else {
            double fuelPrice = getFuelPrice(fuelType);

            if (fuelPrice > 0) {
                double litres = amount / fuelPrice;
                if (litres > petrolLevels[dispenser]) {
                    System.out.println("Error: Not enough petrol in dispenser " + dispenser + ". Please top up more fuel.");
                    return;
                }
                petrolLevels[dispenser] -= litres;
                double totalPrice = litres * fuelPrice;

                printReceipt(receiptNumber++, dispenser, litres, fuelType, totalPrice);

                System.out.printf("Filling up %.2f litres of %s at dispenser %d. Total price: RM%.2f\n", litres, fuelType, dispenser, totalPrice);
            } else {
                System.out.println("Error: Invalid fuel price. Please try again.");
            }
        }
    }

    public void fillUpDispenser(int dispenser) {
        if (dispenser < 0 || dispenser >= petrolLevels.length) {
            System.out.println("Invalid dispenser. Please try again.");
            return;
        }

        double fillAmount = 100.0 - petrolLevels[dispenser];
        petrolLevels[dispenser] = 100.0;

        System.out.printf("Dispenser %d filled up with %.2f litres.\n", dispenser, fillAmount);
    }

    private double getFuelPrice(String fuelType) {
        switch (fuelType.toLowerCase()) {
            case "ron95":
                return fuelPrices[0];
            case "ron97":
                return fuelPrices[1];
            case "diesel":
                return fuelPrices[2];
            default:
                throw new IllegalArgumentException("Invalid fuel type: " + fuelType);
        }
    }

    private void printReceipt(int currentReceiptNumber, int dispenser, double litres, String fuelType, double totalPrice) {
        try {

            String folderName = "azmi,haikal,ubaid-receipt";
            File folder = new File(folderName);
            if (!folder.exists()) {
                folder.mkdir();
            }

            String fileName = folderName + "/receipt_" + currentReceiptNumber + ".txt";

            try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
                writer.println("Receipt Number: " + currentReceiptNumber);
                writer.println("Dispenser: " + dispenser);
                writer.println("Fuel Type: " + fuelType);
                writer.println("Litres: " + String.format("%.2f", litres));
                writer.println("Total Price: RM" + String.format("%.2f", totalPrice));
            }

            System.out.println("Receipt saved to " + fileName);
        } catch (IOException e) {
            System.out.println("Error saving receipt: " + e.getMessage());
        }
    }

    public void displayPetrolLevels() {
        for (int i = 0; i < petrolLevels.length; i++) {
            System.out.printf("Petrol level at dispenser %d: %.2f litres\n", i, petrolLevels[i]);
        }
    }

    private void updateFuelPrices() {
        try {
            URL url = new URL("https://api.data.gov.my/data-catalogue/?id=fuelprice&limit=1");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
    
            int responseCode = connection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                StringBuilder response = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) {
                    response.append(line);
                }
                reader.close();
    
                // Parse JSON response and update fuel prices
                fuelPrices[0] = parseFuelPriceFromJson(response.toString(), "ron95");
                fuelPrices[1] = parseFuelPriceFromJson(response.toString(), "ron97");
                fuelPrices[2] = parseFuelPriceFromJson(response.toString(), "diesel");
    
                
                System.out.println("RON95 Price: RM" + fuelPrices[0]);
                System.out.println("RON97 Price: RM" + fuelPrices[1]);
                System.out.println("Diesel Price: RM" + fuelPrices[2]);
    
            } else {
                System.out.println("Failed to get fuel prices. HTTP response code: " + responseCode);
                
                fuelPrices[0] = 2.03; 
                fuelPrices[1] = 2.28; 
                fuelPrices[2] = 1.99; 
                System.out.println("Using latest updated price 2017:");
                System.out.println("RON95 Price: RM" + fuelPrices[0]);
                System.out.println("RON97 Price: RM" + fuelPrices[1]);
                System.out.println("Diesel Price: RM" + fuelPrices[2]);
            }
    
            connection.disconnect();
        } catch (IOException e) {
            System.out.println("Error updating fuel prices: " + e.getMessage());
            
            fuelPrices[0] = 2.03; 
            fuelPrices[1] = 2.28; 
            fuelPrices[2] = 1.99; 
            System.out.println("Using latest updated price 2017:");
            System.out.println("RON95 Price: RM" + fuelPrices[0]);
            System.out.println("RON97 Price: RM" + fuelPrices[1]);
            System.out.println("Diesel Price: RM" + fuelPrices[2]);
        }
    }
    

    private double parseFuelPriceFromJson(String jsonResponse, String fuelType) {
        double fuelPrice = -1; // Default value if not found
        try {

            // I Assume the JSON response is an array with a single element
            if (jsonResponse.startsWith("[") && jsonResponse.endsWith("]")) {
                jsonResponse = jsonResponse.substring(1, jsonResponse.length() - 1);
            }

            // Parse JSON
            String[] keyValuePairs = jsonResponse.split(",");
            for (String pair : keyValuePairs) {
                String[] entry = pair.trim().split(":");
                if (entry.length == 2) {
                    String key = entry[0].trim();
                    String value = entry[1].trim();

                    
                    if (("\"" + fuelType + "\"").equals(key)) {
                        fuelPrice = Double.parseDouble(value);
                        break;
                    }
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Error parsing fuel price for " + fuelType + ": " + e.getMessage());
        }
        return fuelPrice;
    }

    public static void main(String[] args) {
        System.out.println("==== ++ azmi / haikal / ubaid petrol station system ++ ====");
        System.out.println("Fetching fuel prices from https://api.data.gov.my/");
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(500); 
                System.out.print("."); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("\nFinish Process!\n");

        PetrolStation station = new PetrolStation(3);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Choose a dispenser (0-2):");
            int dispenser = scanner.nextInt();
            if (dispenser < 0 || dispenser >= station.petrolLevels.length) {
                System.out.println("Invalid dispenser. Please try again.");
                continue;
            }

            if (station.petrolLevels[dispenser] < 20.0) {
                System.out.println("Dispenser " + dispenser + " needs to be filled up. Do you want to fill it up? (yes/no):");
                String fillUpChoice = scanner.next().toLowerCase();
                if (fillUpChoice.equals("yes")) {
                    station.fillUpDispenser(dispenser);
                    continue;
                } else {
                    System.out.println("Choose a fuel type (ron95, ron97, diesel):");
                    String fuelType = scanner.next().toLowerCase();
                    if (!fuelType.equals("ron95") && !fuelType.equals("ron97") && !fuelType.equals("diesel")) {
                        System.out.println("Invalid fuel type. Please try again.");
                        continue;
                    }
                    System.out.println("Enter the amount of money to purchase fuel (in RM):");
                    double amount = scanner.nextDouble();
                    station.purchaseFuel(dispenser, amount, fuelType);
                    station.displayPetrolLevels();
                }
            } else {
                System.out.println("Choose a fuel type (ron95, ron97, diesel):");
                String fuelType = scanner.next().toLowerCase();
                if (!fuelType.equals("ron95") && !fuelType.equals("ron97") && !fuelType.equals("diesel")) {
                    System.out.println("Invalid fuel type. Please try again.");
                    continue;
                }
                System.out.println("Enter the amount of money to purchase fuel (in RM):");
                double amount = scanner.nextDouble();
                station.purchaseFuel(dispenser, amount, fuelType);
                station.displayPetrolLevels();
            }
            break;
        }
        scanner.close();
    }
    
}