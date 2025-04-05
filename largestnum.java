
public class largestnum{
public static int largest(int[] arr) {
    int large = arr[0];
    for (int i = 1; i < arr.length; i++) {
        if (arr[i] > large) {
            large = arr[i];
        }
    }
    return large;
}

public static void main(String[] args) {
    int[] arr = {2, 5, 1, 3, 0};
    System.out.println("Largest element: " + largest(arr));
}
}