import java.util.Random;

public class Dice {

    public int numRolls;
    public int numSides;

    public int numDice;

    public Dice(int numDice){
        this.numDice = numDice;
    }

    public int roll(){
        Random rand = new Random();

        int sum = 0;
        for(int i = 0; i < numDice; i ++){
            sum += rand.nextInt(6) + 1;
        }
        return sum;
    }

    public Integer getDiceCount(){
        return numDice;
    }

}
