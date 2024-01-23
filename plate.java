public class plate {
    
    public static void main(String[] args) {
        String plate = generateLicensePlate();
        System.out.println("Generated License Plate: " + plate);
    }

    public static String generateLicensePlate() {
        String plate = generateRandomLetters(3) + generateRandomDigits(4);
        return plate;
    }

    public static String generateRandomLetters(int count) {
        StringBuilder letters = new StringBuilder();
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        for (int i = 0; i < count; i++) {
            int randomIndex = (int) (Math.random() * alphabet.length());
            char randomLetter = alphabet.charAt(randomIndex);
            letters.append(randomLetter);
        }

        return letters.toString();
    }

    public static String generateRandomDigits(int count) {
        StringBuilder digits = new StringBuilder();

        for (int i = 0; i < count; i++) {
            int randomDigit = (int) (Math.random() * 10);
            digits.append(randomDigit);
        }

        return digits.toString();
    }
}
