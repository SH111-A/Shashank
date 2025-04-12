import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of boolean values
        int N = scanner.nextInt();

        // Check if N is a positive integer
        if (N <= 0) {
            System.out.println("Number of boolean values must be a positive integer.");
            return;
        }

        // Create an array to store boolean values
        boolean[] values = new boolean[N];

        // Read the boolean values
        for (int i = 0; i < N; i++) {
            values[i] = scanner.nextBoolean();
        }

        // Print the values in the required format
        for (int i = 0; i < N; i++) {
            System.out.println("Value at index " + i + " is: " + values[i]);
        }

        scanner.close();
    }
}
