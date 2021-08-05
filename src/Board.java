
/**
 * Write a description of class Board here.
 *
 * @author Swarnakeshar Mukherjee
 * @version 05-08-2021
 */
public class Board
{
    // instance variables - replace the example below with your own
    int [][] b;



    /**
     * Constructor for objects of class Board
     * An empty board is initialized to 0s.
     * @param rows the number of rows in the Board
     * @param cols the number of columns in the Board
     */
    public Board(int rows, int cols)
    {
        // initialise instance variables
        b= new int[rows][cols];

    }

    /**
     * The get method returns the value stored at the specified
     * row,col location.
     * @param row The row of the grid
     * @param col The column of the grid
     * @return the int value stored at that row,col
     */
public int get(int row,int col){
return b[row][col];
}



    /**
     * The set method sets the specified row,col location to
     * the specified value
     * @param row The row of the grid
     * @param col The column of the grid
     * @param value The int value to be stored at row,col
     */

    public void set(int row,int col, int value){
        b[row][col] = value;
}

    /**
     * The getRows method returns the number of rows (the height)
     * of the grid
     * @return the rows (height) of the grid
     */

    public int getRows(){
        return b.length;
    }




    /**
     * The getCols method returns the number of columns (the width)
     * of the grid
     * @return the columns (width) of the grid
     */

    public int getCols(){
        return b[0].length;
    }




    /**
     * The toString method returns a String that can be printed to
     * display the grid
     * @return a String representing the grid
     */


public String toString(){
    String result = "";
    for(int r=0;r < getRows();r++){
        for(int c=0; c<getCols();c++){
            result += String.valueOf(b[r][c]);
        }
        result += "\n";
    }

    return result;
}






}
