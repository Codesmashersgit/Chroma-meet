
import java.util.Scanner;

public class MoveZero{
    public static void moveZero(int arr[]){

        int index=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[index]=arr[i];
                index++;
            }
        }
        while(index<arr.length){
            arr[index]=0;
            index++;
        }

    }
    public static void main(String[] arr){
            Scanner sc= new Scanner(System.in);
            System.out.print("enter no. of size:");
            int n=sc.nextInt();
            System.out.println("enter no. of elements:");
            int[] num=new int[n];
           
            for(int i=0;i<num.length;i++){
                num[i]=sc.nextInt();
            }
       moveZero(num);
       System.out.print("the moved zero of an array will be:");
       for(int val:num){
        System.out.print(val+" ");

       }
       

    }
}