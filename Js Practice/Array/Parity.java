import java.util.Scanner;

public class Parity {

    public static void swap(int[] arr,int start,int end){
        while(start<end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;

        start++;
        end--;
        }
    }
    public static void parity(int [] arr){
        int n=arr.length;
        int left=0;
        int right=n-1;

        while(left<right){
            if(arr[left]%2==1 && arr[right]%2==0){
                swap(arr,left,right);
                left++;
                right--;
                

            }
            if(arr[left]%2==0){
                left++;

            }
            if(arr[right]%2==1){
                right--;
            }
        }
    }

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter size:");
        int x=sc.nextInt();
        System.out.println("enter elements:");
        int[] nums=new int[x];

        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        System.out.print("the array will be:");

        for(int re:nums){
            System.out.print(re+" ");
        }

        parity(nums);
        System.out.print("\nParity array will be");
        for(int res:nums){
            System.out.print(res+" ");
        }


    }
    
}
