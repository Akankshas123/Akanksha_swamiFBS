package p1;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] arr = {50, 20, 40, 10, 30};

        System.out.println("Original array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        // Sorting the array in ascending order
        Arrays.sort(arr);

        System.out.println("\nSorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
