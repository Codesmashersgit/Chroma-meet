
    public class Pattern {
        public static void main(String[] args) {
            int n = 5; // Pattern ki rows ki sankhya (yahaan 5 rows hain)
    
           for(int i=n;i>0;i--){
            System.out.print(i+" ");

           }
           System.out.println();

           for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                System.out.print(j+" ");
            }
            System.out.println();
           }
    }
}
