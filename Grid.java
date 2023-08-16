import java.util.ArrayList;
import java.util.Arrays;
import java.lang.ArrayIndexOutOfBoundsException;
 
public class Grid<E> {
	// Data members 
	private ArrayList<ArrayList<E>> cells;
    private int rows;
    private int cols;

	/**
	 *  Default constructor
	 */
	public Grid() {
		cells = new ArrayList<ArrayList<E>>();
        rows = 10;
        cols = 10;
	}

	/**
	 * Constructor with two arguments
	 * @param r value for the size of the rows
	 * @param c value for the size of the cols
	 */
	public Grid(int r, int c) {
        int size = r * c;
		cells = new ArrayList<ArrayList<E>>(size);
	}

    /**
	 * Constructor with one arguments
	 * @param array type E 2-d array 
	 */
	public Grid(E[][] array) {
		cells = new ArrayList<>(); //creates an empty array list cells with a default capacity of 10 rows
        for (int i = 0; i < array.length; i++) {
			cells.add(new ArrayList<>()); //creates an empty array list for row i with default capacity of 10 columns
			for (int j = 0; j < array[i].length; j++) {
				cells.get(i).add(array[i][j]); //add the value array[i][j] to the array list cells.get(i) or row i
			}
        }
	}

	/**
	 * getter for the data member rows
	 * @return value of rows
	 */
	public int getRows() {
		return rows;
	}
	/**
	 * getter for the data member cols
	 * @return value of cols
	 */
	public int getCols() {
		return cols;
	}

	/**
	 * private method to check if the rows is in the bounds
	 * if not throw exception 
	 * @param r value for the size of the rows
	 */
    private void checkRow(int r) throws ArrayIndexOutOfBoundsException{
        if (r > rows || r < 0) {
            throw new ArrayIndexOutOfBoundsException("Row out of bounds");
        }
    }

	/**
	 * private method to check if the cols is in the bounds
	 * if not throw exception 
	 * @param r value for the size of the cols
	 */
    private void checkCol(int c) throws ArrayIndexOutOfBoundsException{
        if (c > cols || c < 0) {
            throw new ArrayIndexOutOfBoundsException("Column out of bounds");
        }
    }

	/**
	 * method to get the Grid object of the rows and cols 
	 * @param row value for the size of the rows
	 * @param col value for the size of the cols
	 * @return grid value with those row and col 
	 */
	public E get(int row, int col) {
		checkRow(row);
		checkCol(col);
		return cells.get(row).get(col);
	}

	/**
	 * method to set the Grid object of the rows and cols 
	 * @param row value for the size of the rows
	 * @param col value for the size of the cols
	 * @return grid value with those row and col 
	 */
	public E set(int r, int c, E v) {
		v = cells.get(r).set(c,v);
		return v;
	}

	/**
	 * returns the two data members between parentheses as a string
	 */
	public String toString() {
		String out = "";
		int index = 0;
		for (int i = 0; i < cells.size(); i++) {
			for (int j = 0; j < cells.size(); j++) {
				out += String.format("%s ", get(i,j));
			}
        }
		return out;
	}




}