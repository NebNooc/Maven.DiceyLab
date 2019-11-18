public class Dice {

    public static Integer rollDie() {
        Integer dieRollValue;
        dieRollValue = (int)(Math.random() * ((6 - 1) + 1)) + 1;
        return dieRollValue;

    }

}
