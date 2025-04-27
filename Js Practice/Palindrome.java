
import java.util.Scanner;

public class Palindrome{
    public static boolean isPalindrome(String str){
        int left=0;
        int right=str.length()-1;

        while(left<right){
            if(str.charAt(left) != str.charAt(right)) {
                return false;  
            }
            left++;
            right--;
        }
        return true; 
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter string: ");
        String str=sc.nextLine();

       boolean result=isPalindrome(str);

        if(result){
            System.out.println(str+" is palindrome");
        }else{
            System.out.println(str+" is not palindrome");
        }




        
    }
}