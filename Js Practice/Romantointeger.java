public class Romantointeger {

    public int value(char c){
        switch(c){
            case 'I':return 1;
            case 'V':return 5;
            case 'X':return 10;
            case 'L':return 50;
            case 'C':return 100;
            case 'D':return 500;
            case 'M':return 1000;
            default: return 0;
        }
    }
    public int Romantointeger(String s){
        int sum=0;
        int n=s.length();
        for (int i = 0; i < n; i++) {
            char c1=s.charAt(i);
            if(i+1<n  && value(c1) < value(s.charAt(i+1))){
                sum=sum-value(c1);
            }
            else{
                sum=sum+value(c1);
            }
            
        }
        return sum;
    }

    public static void main(String[] args){

        Romantointeger obj = new Romantointeger();

        // Test string
        String str = "MCIX";

        // Call the romanToInteger method and print the result
        int result = obj.Romantointeger(str);
        System.out.println("Roman numeral " + str + " is equal to " + result);

    }
    
}
