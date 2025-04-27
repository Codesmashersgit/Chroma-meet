import java.util.Scanner;
public class Subarray{

    public static void element(int[] arr,int target){
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
               sum=sum+arr[j];
               if (sum == target) {
                System.out.print("Subarray with sum :");
                for (int k=i; k<=j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();  
            }
                
            }
        }
        

    }


    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter size of an array:");
        int x=sc.nextInt();
        System.out.print("enter elements of an array:");
        int [] arr= new int[x];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
            System.out.print("The array will be:");

            for(int num:arr){
                System.out.print(num+" ");



            }
          System.out.print("\nenter target value");
          int target=sc.nextInt();

          element(arr, target);
           

      


    }
    
    
}