public class Secondlargestnum {
    
    public static void print2largest(int[] arr) {
        int size = arr.length;
        
        // Check if there are fewer than 2 elements
        if (size < 2) {
            System.out.println("Invalid input");
            return;
        }
        
        // Initialize the first and second largest values
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        
        // Loop through the array
        for (int i = 0; i < size; i++) {
            if (arr[i] > firstLargest) {
                secondLargest = firstLargest;  // Update second largest
                firstLargest = arr[i];         // Update first largest
            } else if (arr[i] > secondLargest && arr[i] != firstLargest) {
                secondLargest = arr[i];        // Update second largest
            }
        }
        
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("There is no second largest number");
        } else {
            System.out.println("Second largest number is: " + secondLargest);
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 4, 5, 35, 34};
        print2largest(arr);
    }
}
