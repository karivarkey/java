import java.util.Scanner;

public class matrix {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int a[][], b[][], sum[][], i, j;
        System.out.print("Enter the number of rows : ");
        int row = reader.nextInt();
        System.out.print("Enter the number of columns : ");
        int column = reader.nextInt();

        a = new int[row][column];
        b = new int[row][column];
        sum = new int[row][column];
        System.out.println("MATRIX A");
        for (i = 0; i < row; i++) {
            for (j = 0; j < column; j++) {
                System.out.println("Enter the element at " + i + " " + j + " :");
                a[i][j] = reader.nextInt();
            }
        }
        System.out.println("MATRIX B");
        for (i = 0; i < row; i++) {
            for (j = 0; j < column; j++) {
                System.out.println("Enter the element at " + i + " " + j + " :");
                b[i][j] = reader.nextInt();
            }
        }

        System.out.println("The sum is : ");
        for (i = 0; i < row; i++) {
            for (j = 0; j < column; j++) {
                sum[i][j] = b[i][j] + a[i][j];
            }
        }
        for (i = 0; i < row; i++) {
            for (j = 0; j < column; j++) {
                System.out.print(sum[i][j] + "\t");
            }
            System.out.println("");
        }
        System.out.println("Transpose of the sum matrix : ");

        for (i = 0; i < column; i++) {
            for (j = 0; j < row; j++) {
                System.out.print(sum[j][i] + "\t");
            }
            System.out.println("");
        }
    }
}
