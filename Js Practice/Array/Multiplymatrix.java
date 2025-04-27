import java.util.Scanner;
public class Multiplymatrix{

    public static void print(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();

        }
    }
  
   
        public static void multiply(int[][] matrix1, int[][] matrix2, int row1,int col1, int row2, int col2) {
            if (col1!=row2) {
                System.out.println("Multiplication not possible: Matrices have different dimensions.");
                return;
            }
    
            int[][] multiply = new int[row1][col2];
    
            
            for (int i=0;i<row1; i++) {
                for (int j = 0; j < col2; j++) {
                    for(int k=0;k<col1;k++){
                    multiply[i][j] += (matrix1[i][k] * matrix2[k][j]);
                    }
                }
            }
    
            
            System.out.println("The multiplication of the two matrices is:");
            print(multiply);
        }
    
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
    
           
            System.out.println("Enter Size of row of matrix 1:");
            int row1 = sc.nextInt();
    
            System.out.println("Enter size of columns of matrix 1:");
            int col1 = sc.nextInt();
    
            int[][] matrix1 = new int[row1][col1];
    
            System.out.println("Enter elements of matrix 1:");
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < col1; j++) {
                    matrix1[i][j] = sc.nextInt();
                }
            }
    
    
            System.out.println("Enter Size of row of matrix 2:");
            int row2 = sc.nextInt();
    
            System.out.println("Enter size of columns of matrix 2:");
            int col2 = sc.nextInt();
    
            int[][] matrix2 = new int[row2][col2];
    
            System.out.println("Enter elements of matrix 2:");
            for (int i = 0; i < row2; i++) {
                for (int j = 0; j < col2; j++) {
                    matrix2[i][j] = sc.nextInt();
                }
            }
    
           
            System.out.println("Matrix 1:");
            print(matrix1);
            System.out.println("Matrix 2:");
            print(matrix2);
    
            
            multiply(matrix1, matrix2, row1, col1, row2, col2);
        }
    }
    

