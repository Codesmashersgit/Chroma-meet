import java.util.Scanner;

class Array2d{
    public static void printarr(int[][] arr){
        System.out.println("the array will be");

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]+" ");

            }
            System.out.println();
        }



    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter number of rows:");
        int rows=sc.nextInt();
        System.out.print("enter no. of columns:");
        int cols=sc.nextInt();
        int[][] num=new int[rows][cols];

        for(int i=0;i<num.length;i++){
            for(int j=0;j<num.length;j++){
               num[i][j]=sc.nextInt();
            }

        }
        printarr(num);
        System.out.println("enter elements you want to search:");
        int x=sc.nextInt();
        for(int i=0;i<num.length;i++){
            for(int j=0;j<num.length;j++){
                if(num[i][j]==x){
                    System.out.println("elements found at "+i+" row "+j+" cols");
                    return;

                }
               
            }
        }





    }
}