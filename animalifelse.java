import java.util.Scanner;

public class animalifelse {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Please enter year: ");
        int year = obj.nextInt();
        int animals = (year - 4) % 12;

        String animal;

        if (animals == 0) {
            animal = "Monkey";
        } else if (animals == 1) {
            animal = "Rooster";
        } else if (animals == 2) {
            animal = "Dog";
        } else if (animals == 3) {
            animal = "Pig";
        } else if (animals == 4) {
            animal = "Rat";
        } else if (animals == 5) {
            animal = "Ox";
        } else if (animals == 6) {
            animal = "Tiger";
        } else if (animals == 7) {
            animal = "Rabbit";
        } else if (animals == 8) {
            animal = "Dragon";
        } else if (animals == 9) {
            animal = "Snake";
        } else if (animals == 10) {
            animal = "Horse";
        } else if (animals == 11) {
            animal = "Sheep";
        } else {
            animal = "Invalid year";
        }

        System.out.println(year + " is the year of the " + animal);

        obj.close();
    }
}
