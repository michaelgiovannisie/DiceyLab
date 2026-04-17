import java.util.Scanner;

public class Simulation {
    int nDice;
    int nToss;
    int min;
    int max;
    Dice dice;
    Bins bins;
    


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nDice = getInput(scanner, "Please enter number of dice: ");
        int nToss = getInput(scanner, "Please enter number of toss: ");
        
        Simulation sim = new Simulation(nDice, nToss);
        sim.runSimulation();
        sim.printResult();
        scanner.close();
        
    }

    public Simulation(int nDice, int nToss){
        this.nDice = nDice;
        this.nToss = nToss;
        min = nDice;
        max = nDice * 6;
        dice = new Dice(nDice);
        bins = new Bins(min, max);
    }

    public void runSimulation(){
        for(int i = 1; i <= nToss; i++){
            int result = dice.tossAndSum();
            bins.incrementBin(result);
        }
    }

    public void printResult(){
        for(int i = min; i <= max; i++){
            int count = bins.getBin(i);
            double prob = (double) count / nToss;
            int starsCount = (int) (prob * 100); 
            System.out.printf("%2d : %7d : %.2f ", i, count, prob);
            for(int j = 0; j < starsCount; j++){
            System.out.print("*");
            }
            System.out.println();
        }
    }

    public static int getInput(Scanner scanner, String Prompt){
    while(true){
        System.out.print(Prompt);
        if(!scanner.hasNextInt()){
            System.out.println("Invalid Input. Please input a number.");
            scanner.next();
            continue;
        } 
        int value = scanner.nextInt();

        if(value <= 0){
        System.out.println("Please enter positive number.");
        continue;
        }
        return value;
    }

}
}

