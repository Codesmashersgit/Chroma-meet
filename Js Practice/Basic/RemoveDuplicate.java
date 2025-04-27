public class RemoveDuplicate {

    public static void main(String[] args) {
        int [] arr={3,3,5,5,6,6,7,8,8,9,9};

       int x=0;
        for(int i=x+1;i<arr.length;i++){
           
            if(arr[i]!=arr[x]){
                x++;
                arr[x]=arr[i];
             

            }
            
           

        }
        for (int i = 0; i <= x; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    
}
