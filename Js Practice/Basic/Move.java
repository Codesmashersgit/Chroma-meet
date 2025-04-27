
// import java.util.Arrays;


// public class Move {
//     public static int[] move(int [] arr){
//         Arrays.sort(arr);
//         return arr;
//     }

//     public static void main(String[] args){
//         int[] arr= {5,-13,-9,3,-7,2,9,-11};
//         int [] ans= move(arr);

//         for(int i=0;i<ans.length;i++){
//             System.out.print(ans[i]+" ");
//         }
       
       

//     }
    
// }

// Java program to Move all negative numbers
// to beginning and positive to end

class Move {

    static int[] move(int[] arr) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {

            // If negative number is present
            // swap it with arr[j]
            if (arr[i] < 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {12, 11, -13, -5, 6, -7, 5, -3, -6};
        int[] ans = move(arr);

        for (int num : ans) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
