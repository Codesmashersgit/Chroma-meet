
import java.util.Arrays;

public class Mergesort{
    public static void mergesort(int[] arr){
        if(arr.length<2){
            return;
        }
        int mid=arr.length/2;

        int[] left=Arrays.copyOfRange(arr,0,mid);
        int[] right=Arrays.copyOfRange(arr,mid,arr.length);

        mergesort(left);
        mergesort(right);

        merge(arr, left, right);


    }
    public static void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        // Compare elements of left and right arrays and merge them into arr
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        // If any elements are left in the left array
        while (i < left.length) {
            arr[k++] = left[i++];
        }

        // If any elements are left in the right array
        while (j < right.length) {
            arr[k++] = right[j++];
        }
    }

    public static void main(String[] args) {
        int[] arr={34,67,10,6,3,89};
        System.out.println("Original Array: " + Arrays.toString(arr));
        mergesort(arr);
        System.out.println("sorted array will be: "+Arrays.toString(arr));

    }
}