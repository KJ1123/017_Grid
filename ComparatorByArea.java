import java.util.Comparator;

public class ComparatorByArea implements Comparator<Coordinate> {

    /**
	 * Method compares for type Coordiantes
     * @param c1 first coordinate pair 
     * @param c2 second coordinate pair 
	 * returns how the area of the each coordinates compare to the other 
	 */
    public int compare(Coordinate c1, Coordinate c2) {
        int x1 = c1.getX();
        int y1 = c1.getY();
        int x2 = c2.getX();
        int y2 = c2.getY();
        Double a1 = (double) (x1 * y1) / 2;
        Double a2 = (double) (x2 * y2) / 2;
        return a1.compareTo(a2);
    }
}