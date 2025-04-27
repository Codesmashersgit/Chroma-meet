import java.util.Arrays;

public class Duplicate {
    public static void main(String[] args) {
        int[] arr={7,8,9,8,9,20};
        Arrays.sort(arr);
       for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
       }
       
        for (int i = 0; i <arr.length; i++) {
           
           
            if(arr[i] == arr[i+1]){
              return;
            }
            else{
                System.out.println("\n"+arr[i]);
            }
            
        }
    }
}


