import java.util.Comparator;
import java.lang.Math;

public class ComparatorByDistance implements Comparator<Coordinate> {

    /**
	 * Method compares for type Coordiantes
     * @param c1 first coordinate pair 
     * @param c2 second coordinate pair 
	 * returns how the distance of the each coordinates compare to the other 
	 */
    public int compare(Coordinate c1, Coordinate c2) {
        int x1 = c1.getX();
        int y1 = c1.getY();
        int x2 = c2.getX();
        int y2 = c2.getY();
        Double d1 = (double) Math.sqrt(x1 + y1);
        Double d2 = (double) Math.sqrt(x2 + y2);
        return d1.compareTo(d2);
    }
}