import java.util.Arrays;

/**
 * Create a tracking class Bins that can be used to track these results.
 *
 * Bins results = new Bins(2, 12); // for bins from 2..12 (Start and end point)
 * Integer numberOfTens = results.getBin(10); // returns the number of tens in the 10 bin
 * results.incrementBin(10); // should increment bin # 10
 *
 * make a couple unit tests for the Bins class.
 *
 * public Inventory(List<String> strings) {
 *         this.itemMap = new HashMap<>();
 *         for (String product : strings) { //([datatype] nameOfIndividualItem : collection)
 *             this.itemMap.put(product, 1);
 *         }
 *     }
 */

public class Bins {

    private int startingBin;
    private int endingBin;
    Integer[] bins;

    public Bins(int startingBin, int endingBin) {
        this.startingBin = startingBin;
        this.endingBin = endingBin;
        bins = new Integer[(endingBin - startingBin) + 1]; //had to add 1 because it was out of bounds otherwise
        Arrays.fill(bins, 0);
    }

    public int getBin(int binNumber) {
        return bins[binNumber - startingBin];
    }

    public void incrementBin(int binNumber) {
        bins[binNumber - startingBin]++;
    }

    public int getStartingBin() { //generated getters and setters
        return startingBin;
    }

    public void setStartingBin(int startingBin) {
        this.startingBin = startingBin;
    }

    public int getEndingBin() {
        return endingBin;
    }

    public void setEndingBin(int endingBin) {
        this.endingBin = endingBin;
    }
}





