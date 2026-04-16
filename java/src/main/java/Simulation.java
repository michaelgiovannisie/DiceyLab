public class Simulation {

    public static void main(String[] args) {
        Dice dice = new Dice(2);
        int result = dice.tossAndSum();
        System.out.println("Total 2 Dices= " + result);
    }
}
