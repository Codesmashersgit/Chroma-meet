import java.util.Scanner;
public class Matrix{

    public static void matrix(int[][] arr ,int row,int col){
        System.out.print("the array will be:\n");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
    }

    }


    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of an row:");
        int row= sc.nextInt();

        System.out.print("Enter size of column:");
        int col=sc.nextInt();

        int [][] arr= new int[row][col];

        System.out.print("enter elements:");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
            }
        }
       

        
      matrix(arr, row, col);


    }
}
