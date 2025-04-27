
import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter size of an array: ");
        int size=sc.nextInt();
        System.out.println("enter no. of elements: ");
         int[] arr=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("enter no.you have to search: ");
        int search=sc.nextInt();
        int li=0;
        int hi=arr.length-1;
        int mid=(li+hi)/2;

        while(li<=hi){
            if(arr[mid]==search){
                System.out.println("element found at "+mid+" index");
                break;

            }
            else if(arr[mid]<search){
                li=mid+1;
            }
            else{
                hi=mid-1;
            }
            
                mid=(li+hi)/2;
        }
        if(li>hi){
            System.out.println("element not found");
        }
    }
    
}
