public class Recursionsum {

    public static int Sum(int n) {
        if(n==0){
            return 0;
        }
        return n+Sum(n-1);
        
    }
    public static void main(String[] args) {
        int num=15;

        System.out.println("the sum of "+num +" is:"+ Sum(num));
    }
    
}
