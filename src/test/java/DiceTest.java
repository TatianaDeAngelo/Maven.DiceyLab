import org.junit.Assert;
import org.junit.Test;



public class DiceTest {

    @Test
    public void tossAndSum2Test() {
        //Given
        Dice dice = new Dice(2);

        //When
        int actual = dice.tossAndSum();

        //Then
        Assert.assertTrue(actual >= 2 && actual <= 12);

    }

    @Test
    public void tossAndSum5Test() {
        //Given
        Dice dice = new Dice(5);

        //When
        int actual = dice.tossAndSum();

        //Then
        Assert.assertTrue(actual >= 5 && actual <= 30);

    }

    @Test
    public void numOfDiceTest() {
        //Given
        int expectedNumOfDice = 2;
        Dice dice = new Dice(expectedNumOfDice);

        //When
        int actualNumOfDice = dice.getNumOfDice();

        //Then
        Assert.assertEquals(expectedNumOfDice, actualNumOfDice);
    }
}