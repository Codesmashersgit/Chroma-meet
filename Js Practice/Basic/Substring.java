public class Substring {

    public static void main(String[] args) {
       String sb="abc";
      
        for(int i=0;i<sb.length();i++){
            // for(int j=i+1;j<=sb.length();j++){
            //     System.out.print(sb.substring(i,j)+" ");
            // }
          int ascii= sb.charAt(i);
            System.out.println(ascii);
        }
           
    }
}  

