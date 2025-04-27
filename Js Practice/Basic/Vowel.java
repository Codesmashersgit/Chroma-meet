import java.util.Scanner;

public class Vowel {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ek character enter karein: ");
        char ch = scanner.next().charAt(0);

        ch=Character.toLowerCase(ch);


        if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'){
            System.out.println(ch+" is vowel");
            

        }
        else{
            System.out.println(ch+" it is consonant");
        }

    }
    
}
