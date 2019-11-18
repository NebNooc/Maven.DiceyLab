import java.util.ArrayList;

public class Bins extends ArrayList {
    int[] bin;

    public Bins(int numberOfDice) {
        createBinWithDice(numberOfDice);
    }

    public void createBinWithDice(Integer numberOfDice) {
        bin = new int[(numberOfDice * 6) + 1];

    }

    public int[] getBin() {
        return bin;
    }
}