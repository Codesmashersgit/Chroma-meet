
import java.util.Scanner;

public class Array{
    public static void printarr(int[]arr){
        System.out.print("the array will be:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter no. of size:");
        int n=sc.nextInt();
        System.out.print("enter no. of elements:");
        int[] num=new int[n];
       
        for(int i=0;i<num.length;i++){
            num[i]=sc.nextInt();
        }
        
        printarr(num);
    }

}

