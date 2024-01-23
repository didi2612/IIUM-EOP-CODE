public class array {
    public static void main(String[] args) {
        // Method 1: Declare and initialize an array in one line
        int[] numbers1 = {1, 2, 3, 4, 5};

        // Method 2: Declare an array and then initialize it
        int[] numbers2;
        numbers2 = new int[]{6, 7, 8, 9, 10};

        // Method 3: Declare and initialize an array with a specified size
        int size = 5;
        int[] numbers3 = new int[size];
        for (int i = 0; i < size; i++) {
            numbers3[i] = i + 11;
        }

        // Print the elements of each array
        System.out.println("Numbers 1:");
        printArray(numbers1);

        System.out.println("\nNumbers 2:");
        printArray(numbers2);

        System.out.println("\nNumbers 3:");
        printArray(numbers3);
    }

    // Helper method to print the elements of an array
    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
