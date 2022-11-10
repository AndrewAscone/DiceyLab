import java.util.TreeMap;

public class Bins {

    Integer numberOfRolls;

    Integer diceRoll;

    private final TreeMap<Integer, Integer> bins;

    public Bins(int lowLimit, int upperLimit){
        
        this.bins = new TreeMap<Integer, Integer>();

        for(int i = lowLimit; i <= upperLimit; i++){
            bins.put(i, 0);
        }
    }

    public void addRollToBin(int rollTotal){
        bins.put(rollTotal, bins.get(rollTotal) + 1);
        //this.numberOfRolls++;
    }

    public Integer getBin(int rollTotal){ //getBin (OF VALUE)
        return bins.get(rollTotal);
    }

    public Integer getBinValue(int rollTotal){
        return bins.put(rollTotal, bins.get(rollTotal));
    }
}
