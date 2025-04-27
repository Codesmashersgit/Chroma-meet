

public class Unique{
     
    public static void main(String[] args) {
        int[] arr= {2,3,5,3,5,2,7};
       
        // for(int i=0;i<arr.length;i++){
        //     int count=0;
        //     for(int j=0;j<arr.length;j++){
        //         if(arr[i]==arr[j]){
        //             count++;
        //         }
        //     }
        //         if(count==1){
        //             System.out.println(arr[i]);
        //         }
        //         else{
                    

        //         }
               
        //     }
        int ans= arr[0];
        for(int i=1;i<arr.length;i++){
            ans= ans^arr[i];
        }
        System.out.println(ans);
    }
}

// for(int i=0;i<arr.length;i++){
//     for(int j=i+1;j<arr.length;j++){
//         if(arr[i] == arr[j]){
//             System.out.println(arr[i]);
//         }
     
       

//     }
// }