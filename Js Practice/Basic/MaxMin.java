public class MaxMin {

    public static void main(String[] args) {
        int[] arr={4,2,3,1,45,90,123,-90};

        int max= arr[0];
        int min=arr[0];

        for(int i=1;i<arr.length;i++){

            if(arr[i] > max){
                max= arr[i];
            }
            if(arr[i] < min){
                min= arr[i];
            }
        }
        System.out.println("Maximum value: "+ max);
        System.out.println("Minimum Value: "+ min);


        
    }
    
}
