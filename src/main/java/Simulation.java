import java.util.Scanner;

public class Simulation {

    private static Integer numberOfRolls;
    private Integer numberOfDice;


    public int[] diceSim() {
        Bins bin = new Bins(numberOfDice);
        int[] arr = bin.getBin();

        for (int i = 0; i < numberOfRolls; i++) {
            Integer rollTotal = 0;
            for (int j = 0; j < numberOfDice; ++j) {
                new Dice();
                rollTotal += Dice.rollDie();
            }
            arr[rollTotal]++;
        } return arr;
    }

    public void runSimulation() {
        getUserInput();
        rollDice();
    }

    public void rollDice(){
        int[] dataset = diceSim();

        for (int i = numberOfDice; i < dataset.length; ++i) {
            Float decimal = (float)dataset[i]/numberOfRolls;
            Double percent = Math.floor(decimal*100);
            System.out.printf("%2s :%9s:%5.2f " + printStars(percent) + "\n", i, dataset[i], decimal);
        }
    }

    public String printStars(Double numberOfStars) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numberOfStars; i++) {
            sb.append("*");
        } return sb.toString();
    }

    public void getUserInput() {
        System.out.println("How many d6 to roll?");
        Scanner scanner = new Scanner(System.in);
        numberOfDice = scanner.nextInt();
        System.out.println("How many rolls?");
        numberOfRolls = scanner.nextInt();
    }
}
