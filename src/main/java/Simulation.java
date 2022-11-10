public class Simulation {

    public Simulation(Integer numberOfDice, Integer numberOfRolls){
        //call roll method from dice, passing in values passed to simulation
        //pass values from resulting rolls to bins for sorting
        //get a printed output of stored results
    }

    public static void main(String[] args) {
        int numDice = 2;
        Dice d1 = new Dice(numDice);


        //System.out.println(value);

        int upperLimit = numDice * 6;

        Bins container = new Bins(numDice, upperLimit);

        int totalRolls = 10;
        for (int i = 0; i < totalRolls; i++) {
            int value = d1.roll();
            container.addRollToBin(value);
            System.out.print(value + " ");
            //System.out.println("Bin index " + container.getBin(value) + " currently holds " + container.getBinValue(value));
        }

        System.out.println("");

        for (int i = numDice; i <= upperLimit; i++) {
            System.out.println("Bin " + i + " holds " + container.getBin(i));
        }

    }

}
