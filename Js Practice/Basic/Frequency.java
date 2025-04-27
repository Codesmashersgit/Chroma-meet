
import java.util.HashMap;


// import java.util.Arrays;

// public class Frequency{
//     public static void main(String[] args) {
//         int [] arr= {3,2,1,2,1,1};
//         Arrays.sort(arr);

//         int count=1;
//         int maxfreq=1;
//         for(int i=0;i<arr.length-1;i++){
            
//             if(arr[i] == arr[i+1]){
//                 count++;
               

//             }
//             else{
//                 count=1;
//             }

//             if(count>maxfreq){
//                 maxfreq=count;
//             }

            
            

//         }
//         System.out.println(maxfreq);
//     }
// }

public class Frequency{
    public static void main(String[] args) {
        int[] arr= {4,2,5,2,2,4,1,1,2};
        HashMap<Integer,Integer> mp= new HashMap<>();

        for(int el:arr){
            if(!mp.containsKey(el)){
                mp.put(el,1);
            }
            else{
                mp.put(el, mp.get(el)+1);
            }
           
            
        }
        System.out.println(mp.entrySet());

     
    }
}