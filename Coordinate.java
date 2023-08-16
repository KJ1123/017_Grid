public class Coordinate {
    //data members
    private Pair<Integer, Integer> point;

    /**
	 * Constructor with two arguments
	 * @param x value to initialize the data member x
	 * @param y value to initialize the data member y
	 */
    public Coordinate(int x, int y) {
        point = new Pair<>(x,y);
    }

    /**
	 * getter for the data member X
	 * @return value of X
	 */
    public int getX() {
        return point.getFirst();
    }

    /**
	 * getter for the data member Y
	 * @return value of Y
	 */
    public int getY() {
        return point.getSecond();
    }
    
    /**
	 * setter for the data member X
	 * @param x value to set X
	 */
    public void setX(int x) {
        point.setFirst(x);
    }

    /**
	 * setter for the data member Y
	 * @param y value to set Y
	 */
    public void setY(int y) {
        point.setSecond(y);
    }

    /**
	 * translate for the data member Y
	 * @param d value add Y by 
	 */    public void translateX(int d) {
        int newFirst = point.getFirst() + d;
        point.setFirst(newFirst);
    }

    /**
	 * translate for the data member Y
	 * @param d value add Y by 
	 */
    public void translateY(int d) {
        int newSecond = point.getSecond() + d;
        point.setSecond(newSecond);
    }

    /**
	 * scales for the data member X
	 * @param f value multiply Y by 
	 */
    public void scaleX(int f) {
        int newFirst = point.getFirst() * f;
        point.setFirst(newFirst);
    }

    /**
	 * scales for the data member Y
	 * @param f value multiply Y by 
	 */
    public void scaleY(int f) {
        int newSecond = point.getSecond() * f;
        point.setSecond(newSecond);
    }

    /**
	 * returns the two data members between parentheses as a string
	 */
    public String toString() {
        return point.toString();
    }

    /**
	 * Method equals for type Pair
     * @param o object
	 * returns true if two pairs are identical
	 */
    public boolean equals(Object o) {
        if(o instanceof Coordinate) {
			Coordinate c = (Coordinate) o;
			boolean same = this.point.equals(c.point);
			return same;
		}
		return false;
    }

    


}