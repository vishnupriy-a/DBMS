import java.util.Scanner;

public class MatrixAddition {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      System.out.print("Enter the number of rows in the matrices: ");
      int rows = input.nextInt();

      System.out.print("Enter the number of columns in the matrices: ");
      int cols = input.nextInt();

      int[][] matrix1 = new int[rows][cols];
      int[][] matrix2 = new int[rows][cols];

      System.out.println("Enter the elements of the first matrix: ");
      for (int i = 0; i < rows; i++) {
         for (int j = 0; j < cols; j++) {
            matrix1[i][j] = input.nextInt();
         }
      }

      System.out.println("Enter the elements of the second matrix: ");
      for (int i = 0; i < rows; i++) {
         for (int j = 0; j < cols; j++) {
            matrix2[i][j] = input.nextInt();
         }
      }

      int[][] sum = new int[rows][cols];

      for (int i = 0; i < rows; i++) {
         for (int j = 0; j < cols; j++) {
            sum[i][j] = matrix1[i][j] + matrix2[i][j];
         }
      }

      System.out.println("The sum of the two matrices is: ");
      for (int i = 0; i < rows; i++) {
         for (int j = 0; j < cols; j++) {
            System.out.print(sum[i][j] + " ");
         }
         System.out.println();
      }
   }
}
