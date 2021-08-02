import org.junit.Assert;
import org.junit.Test;

public class BinsTest {

    @Test
    public void binNumTest() {
        //Given
        int expectedStartingBin = 2;
        int expectedEndingBin = 12;
        Bins bins = new Bins(expectedStartingBin, expectedEndingBin);

        //When
        int actualStartingBin = bins.getStartingBin();
        int actualEndingBin = bins.getEndingBin();

        //Then
        Assert.assertEquals(expectedStartingBin, actualStartingBin);
        Assert.assertEquals(expectedEndingBin, actualEndingBin);
    }

}