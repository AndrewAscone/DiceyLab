public class Simulation {

    public Simulation(Integer numberOfDice, Integer numberOfRolls){
        //call roll method from dice, passing in values passed to simulation
        //pass values from resulting rolls to bins for sorting
        //get a printed output of stored results
    }

    public static void main(String[] args) {
        int numDice = 2;
        int totalRolls = 1000000;
        int upperLimit = numDice * 6;

        Dice d1 = new Dice(numDice);
        Bins container = new Bins(numDice, upperLimit);

        //System.out.println(value);


        for (int i = 0; i < totalRolls; i++) {
            int value = d1.roll();
            container.addRollToBin(value);
            //System.out.print(value + " ");
            //System.out.println("Bin index " + container.getBin(value) + " currently holds " + container.getBinValue(value));
        }

        System.out.println("");

        //Format output in the following style
        //2 :    27917: 0.03 ** (Bin number, single space, :, 9 spaces allocated for result, :, decimal number with 2 spaces before and after decimal point, single space, star output)
        for (int i = numDice; i <= upperLimit; i++) {
            System.out.println("Bin " + i + " holds " + container.getBin(i));
        }

    }

}
