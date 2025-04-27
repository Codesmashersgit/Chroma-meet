public class Factorial {
    public static int printfactorial(int n){
        if(n==1 || n==0 ){
            return 1;

        }
        if(n<0){
            return 0;
        }
        int fact_nm1= n*printfactorial(n-1);
        return fact_nm1;

    }
    public static void main(String[] args){
        int n=-1;
        System.out.println(printfactorial(n));

    }
    
}
