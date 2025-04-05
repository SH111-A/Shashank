import java.util.Scanner;

public class bubbleSort {
    public static void main(String[] args) {
        int array[] = {9, 1, 8, 7, 3, 6, 4, 5};
        bubbleSort(array);
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    public static void bubbleSort(int array[]) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}