import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class shufflearray {
    public static void main(String[] args) {
        // Create an array
        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Convert the array to a list
        List<Integer> list = new ArrayList<>(Arrays.asList(numbers));

        // Shuffle the list
        Collections.shuffle(list);

        // Convert the list back to an array
        Integer[] shuffledArray = list.toArray(new Integer[0]);

        // Print the shuffled array
        System.out.println("Shuffled Array:");
        for (int num : shuffledArray) {
            System.out.print(num + " ");
        }
    }
}
