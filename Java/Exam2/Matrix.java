public class Matrix implements Hello
{
    // Creating the data fields that include an integer for row,
    // and integer for column, and a two-dimensional array of
    // type integer for the matrix elements.
    protected int row;      // Matrix row
    protected int column;   // Matrix column
    protected int [][]data; // 2D array

    // Default constructor
    public Matrix()
    {
        row    = 0;
        column = 0;
    }

    // Accessing element at position i,j
    public int getData(int i, int j)
    {
        return data[i][j];
    }



    // Changing matrix element at position i,j
    public void setData(int i, int j, int value)
    {
        data[i][j] = value;
    }


    //  Create a constructor that takes a 2D array
    //  of integers (i.e: int[][] array), and the
    // class attributes should be modified accordingly.
    public Matrix(int [][] array)
    {
      data = array.clone();
      row = array.length;
      column = array[0].length;

        for(int i = 0; i < array.length; i++){
          for(int j = 0; j < array.length; j++){
            setData(i, j, array[i][j]);
          }
        }
    }


    // Add two given matrices. Print "The sizes of the matrices do not match."
    // if the operation cannot be performed and return a Matrix object with 0
    // rows and 0 columns.
    public Matrix plus(Matrix B)
    {
      int temp[][]= new int[row][column];
      Matrix C = new Matrix(temp);
      for(int i = 0; i < row; i++){
        for(int j = 0; j < column; j++){
          C.setData(i,j,(getData(i, j) + B.getData(i, j)));
        }
      }
      return C;
    }


    // Substract two given matrices. Print "The sizes of the matrices do not match."
    // if the operation cannot be performed and return a Matrix object with 0
    // rows and 0 columns.
    public Matrix minus(Matrix B)
    {
      int temp[][]= new int[row][column];
      Matrix C = new Matrix(temp);
      for(int i = 0; i < row; i++){
        for(int j = 0; j < column; j++){
          C.setData(i,j,(getData(i, j) - B.getData(i, j)));
        }
      }
      return C;
    }


    // Printing matrix data row by row where each line
    // starts and ends with |. Assuming that you have
    // row, column, and data in your class data fields,
    // your print function should look like the following:
    public void print()
    {
        for (int i = 0; i < row; i++)
        {
            System.out.print("|");
            for (int j = 0; j  < column; j++)
            {
                System.out.printf("%3d", data[i][j]);
            }
            System.out.println("|");
        }
    }

}
