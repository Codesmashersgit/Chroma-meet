// public class Count {


//     public static void main(String[] args) {
//         String str="aaabbbcccdaaae ";
//         int count =1;
//         String ans= " "+str.charAt(0);

//         for(int i=1;i<str.length();i++){
//             char prev= str.charAt(i-1);
//             char curr= str.charAt(i);
//             if(prev == curr){
//                 count++;
//             }
//             else{
//                if(count>1) ans= ans+count;
//                 count=1;
//                 ans= ans+curr;


//             }

//             }
//             if(count>1) ans= ans+count;
//             System.out.println(ans);
//         }
//     }
    
// public class Main {
//     public static void main(String[] args) {
//         String input = "aaabbbcccdaaae";
//         StringBuilder result = new StringBuilder();
        
//         // Loop to count the frequency of each character
//         for (int i = 0; i < input.length(); i++) {
//             char currentChar = input.charAt(i);
//             int count = 1;
            
//             // Count the occurrences of the same character
//             while (i + 1 < input.length() && input.charAt(i + 1) == currentChar) {
//                 i++;
//                 count++;
//             }
            
//             // Append character and count to result
//             result.append(currentChar).append(count);
//         }

//         System.out.println(result);
//     }
// }


public class Main{
    public static void main(String[] args) {
        String str="aaazzbccoooooab";
        StringBuilder result= new StringBuilder();

        for(int i=0;i<str.length();i++){
            char currentChar= str.charAt(i);
            int count=1;
       
            while(i+1<str.length() && str.charAt(i+1)==currentChar){
                i++;
                count++;
            }
            result.append(currentChar).append(count);



        
    }
    System.out.println(result);
}
}
