import java.util.Scanner;
public class Prefix {

    public static int[] prefixsum(int[] arr){
        for(int i=1;i<arr.length;i++){
            arr[i]=arr[i]+arr[i-1];

        }
        return arr;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter size:");
        int x=sc.nextInt();
        System.out.println("enter no.of elements:");
        int [] nums=new int[x];

        for(int i=0;i<nums.length;i++){
           nums[i]=sc.nextInt();

        }
        System.out.print("the array will be:");
        for(int num:nums){
            System.out.print(num+" ");
        }


        prefixsum(nums);
        System.out.print("\nThe prefix sum will be:");
        for(int num:nums){
            System.out.print(num+" ");

        }


    }
    
}
