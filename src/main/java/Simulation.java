import java.util.Scanner;

public class Simulation {

    public static Integer numDice = 0;

    public static Integer totalRolls = 0;

    public static Integer upperLimit = 0;

    public static Bins container;

    public Simulation(Integer numberOfDice, Integer numberOfRolls){
        //call roll method from dice, passing in values passed to simulation
        //pass values from resulting rolls to bins for sorting
        //get a printed output of stored results
        numDice = numberOfDice;
        totalRolls = numberOfRolls;
        upperLimit = numDice * 6;
        container = new Bins(numDice, upperLimit);
    }

    public static void main(String[] args) {
        int numDice = 2;
        int totalRolls = 1000000;
        Simulation sim = new Simulation(numDice, totalRolls);

//        numDice = sim.getDiceToRoll();
//        totalRolls = sim.getNumberOfRolls();

        sim.runSim();

        sim.printResult();

    }

    public static String printStars(int binNum){
        String stars = "";
        for(int i = 0; i < Math.round(container.percentageOfBin(binNum)*100); i++){
            stars += "*";
        }

        return stars;
    }

    public void printResult(){
        System.out.println("***\nSimulation of " + numDice + " dice tossed for " + totalRolls + " times\n***\n");

        for (int i = numDice; i <= upperLimit; i++) {
            String str = String.format("%2d" + " :" + " %9d: %.2f %s", i, container.getBin(i), container.percentageOfBin(i), printStars(i));
            System.out.println(str);
        }
    }

    public void runSim(){
        Dice d1 = new Dice(numDice);
        for (int i = 0; i < totalRolls; i++) {
            int value = d1.roll();
            container.addRollToBin(value);
            //System.out.print(value + " ");
            //System.out.println("Bin index " + container.getBin(value) + " currently holds " + container.getBinValue(value));
        }
    }

//    public Integer getDiceToRoll(){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("How many dice should be rolled?");
//        numDice = scanner.nextInt();
//        return numDice;
//
//
//    }
//
//    public Integer getNumberOfRolls(){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("And how many times should we roll the dice?");
//        totalRolls = scanner.nextInt();
//        return totalRolls;
//    }

}
