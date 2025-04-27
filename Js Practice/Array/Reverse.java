public class Reverse{
    public static void reverseArray(int[] arr){
        int i=0;
        int j=arr.length-1;

        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;


            i++;
            j--;
        }

       
  



    }

    public static void main(String[] args) {
        int[] arr={4,3,20,56,78};

        reverseArray(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        



    }
}