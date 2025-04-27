public class Power {
    public static int calculatepower(int x,int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;

        }
        int pm=calculatepower(x, n-1);
        int pm1= x*pm;
        return pm1;

    }
    public static void main(String[]args){
        int n=5;
        int x=3;
        System.out.println(calculatepower(x, n));

    }
    
}
