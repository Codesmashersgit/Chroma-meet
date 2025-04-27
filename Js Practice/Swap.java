
import java.util.Scanner;


public class Swap {
    
    public static void Swap(int a, int b){
        

       int temp=a;
        a=b;
        b=temp;
        System.out.println("the swapped value of a will be :"+a);
        System.out.println("the swaaaped value of b will be :"+b);
        


    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of a:");
        int a=sc.nextInt();
        System.out.println("enter the value of b");
        int b=sc.nextInt();
        Swap(a, b);

        



        
    }
   
}
