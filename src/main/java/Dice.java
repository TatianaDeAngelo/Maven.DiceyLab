import java.util.Random;

/**
 Dice dice = new Dice(2); // for craps
 Dice dice = new Dice(5); // for yatzee

 Integer toss = dice.tossAndSum();

 Copied from My Casino project
 public static int roll() {
 Random randomGenerator = new Random();
 int dice1 = randomGenerator.nextInt(6) + 1;
 int dice2 = randomGenerator.nextInt(6) + 1;
 System.out.printf("\nShooter rolled %d and %d", dice1, dice2);
 return dice1 + dice2;
 }
 *
 *
 */

public class Dice {

    int numOfDice;

    public Dice(int numOfDice) {
        this.numOfDice = numOfDice;
    }

    public int getNumOfDice() { //created getters and setter
        return numOfDice;
    }

    public void setNumOfDice(int numOfDice) {
        this.numOfDice = numOfDice;
    }

       public int tossAndSum() {
        int sum = 0;
        for (int i = 0; i < numOfDice; i++) { //to have the correct min and max, i must start at 1 if the index starts at 0 the numbers are off by 1
            sum += (int) (((Math.random() * 6) + 1));
        }

        return sum;
    }
}





