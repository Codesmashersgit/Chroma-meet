
import java.util.Scanner;



public class Swap2 {
    public static void Swap(int a,int b){
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("the swapped value of a will be: "+a);
        System.out.println("the swapped value of b will be: "+b);

    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the value of a:");
        int a=sc.nextInt();
        System.out.print("enter the value of b:");
        int b=sc.nextInt();

        Swap(a, b);
    }
    
}
