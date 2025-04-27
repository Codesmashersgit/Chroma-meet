public class Min {
    public static void main(String[] args) {
        int[] arr= {43,56,89,10,9,89,88,432};

        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println(min);
    }
    
}
