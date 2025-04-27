

import java.util.Scanner;

class RotateArray {
    public static void rotateArray(int[] arr, int k) {
        int n = arr.length;
        
        // Ensure k is within the bounds of the array
        k = k % n;
        
        // Step 1: Reverse the entire array
        reverse(arr, 0, n - 1);
        
        // Step 2: Reverse the first k elements
        reverse(arr, 0, k - 1);
        
        // Step 3: Reverse the remaining n - k elements
        reverse(arr, k, n - 1);
    }
    
    // Helper method to reverse a portion of the array
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        System.out.print("Enter the number of positions to rotate: ");
        int k = sc.nextInt();
        
        // Initialize the array
        int[] arr = new int[n];
        
        System.out.print("Enter the elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Rotate the array by k positions
        rotateArray(arr, k);

        // Print the rotated array
        System.out.print("Rotated array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
