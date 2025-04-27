public class Max2{
    public static void main(String[] args){
        int[] arr={3,4,5,45,67,65,103};
        int temp;

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                }

            }
        }
        System.out.println(arr[2]);


}

}