public class Selection {
    public static void printsort(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }


    }
    public static void main(String[] args){
        int[] arr={34,12,9,2,3,1};
        
        for(int i=0;i<arr.length;i++){
            int smallest=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[smallest]>arr[j]){
                    smallest =j ;
                   
                }

            }
            int temp=arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
        }
        printsort(arr);
    }
    
}
