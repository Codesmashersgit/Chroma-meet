import java.util.Scanner;

public class Sort {
    public static void Swap(int[]arr,int start,int end){
        while(start < end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

            start++;
            end--;


        }

    }
    public static void sortElement(int[] arr){
        int n=arr.length;
        int left=0;
        int right=n-1;

        while(left<right){
            if(arr[left]==1 && arr[right]==0){
                Swap(arr,left,right);
                left++;
                right--;

            }
           if(arr[left]==0){
             left++;
           }
           if(arr[right]==1){
            right--;
           }
        }




    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter size :");
        int n=sc.nextInt();
        System.out.print("enter no. of elements");
        int[] nums= new int[n];

        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        System.out.print("the array will be:");

        for(int res:nums){
            System.out.print(res+" ");
        }
        sortElement(nums);  
        System.out.print("\nSorted array will be: ");
        for (int res:nums) {
            System.out.print(res+" ");
        }
     

    }
    
}
