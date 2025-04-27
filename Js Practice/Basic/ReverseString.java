public class ReverseString {
    public static void main(String[] args) {
        String str = "Hello World";
       String [] arr = str.split(" ");

       for(int i=0;i<arr.length;i++){
          StringBuilder sb = new StringBuilder(arr[i]);
            System.out.println(sb.reverse());

       }
    }

      
}
