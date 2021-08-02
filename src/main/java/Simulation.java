/**
 * Create a simulation where two dice are thrown one million times. Keep track of all results.
 *
 * Simulation sim = new Simulation(2, 10000);
 *
 * sim.runSimulation();
 *
 * sim.printResults();
 */


public class Simulation {

    private int numOfDice;
    private int numOfTosses;
    Dice simDice;
    Bins simBins;
    Integer[] results;


    public static void main(String[] args) {
        Simulation sim = new Simulation(2, 1000000);
        sim.runSimulation();
        //sim.printResults();
    }

    public Simulation(Integer numOfDice, Integer numOfTosses) {
        this.numOfDice = numOfDice;
        this.numOfTosses = numOfTosses;
    }

    public void runSimulation() {
        Dice simDice = new Dice(this.numOfDice);
        Bins simBins = new Bins(simDice.getNumOfDice(), (simDice.getNumOfDice() * 6));

        for (int i = 0; i < numOfTosses; i++) {
            simBins.incrementBin(simDice.tossAndSum());
        }

        System.out.println(numOfTosses);

    }



}
