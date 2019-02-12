import java.util.Scanner;

public class Sample
{
    public static void main(String[] args)
    {
        int row, col;
        Scanner sc = new Scanner(System.in);

        // -------------------
        // Matrix A
        // -------------------
        System.out.print("How many rows in Matrix A? ");
        row = Integer.parseInt(sc.nextLine());

        System.out.print("How many columns in Matrix A? ");
        col = Integer.parseInt(sc.nextLine());

        int [][] dataA = new int[row][col];
        for (int i = 0; i < row; i++)
        {
            System.out.printf("Enter elements in row %d (space separated): ", i);
            String line = sc.nextLine();
            String[] row_data = line.split(" ");
            for (int j = 0; j < col; j++)
            {
                dataA[i][j] = Integer.parseInt(row_data[j]);
            }
        }

        // -------------------
        // Matrix A
        // -------------------
        System.out.print("How many rows in Matrix B? ");
        row = Integer.parseInt(sc.nextLine());

        System.out.print("How many columns in Matrix B? ");
        col = Integer.parseInt(sc.nextLine());

        int [][] dataB = new int[row][col];
        for (int i = 0; i < row; i++)
        {
            System.out.printf("Enter elements in row %d (space separated): ", i);
            String line = sc.nextLine();
            String[] row_data = line.split(" ");
            for (int j = 0; j < col; j++)
            {
                dataB[i][j] = Integer.parseInt(row_data[j]);
            }
        }

        Matrix A = new Matrix(dataA);
        System.out.println("A:");
        A.print();
        System.out.println();

        Matrix B = new Matrix(dataB);
        System.out.println("B:");
        B.print();
        System.out.println();

        System.out.println("C = A + B:");
        Matrix C = A.plus(B);
        C.print();
        System.out.println();

        System.out.println("D = A - B:");
        Matrix D = A.minus(B);
        D.print();
        System.out.println();
    }
}
