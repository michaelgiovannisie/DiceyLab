
import java.util.Random;


public class Dice {

    public static int dice(){
        Random rand = new Random();
        int n = rand.nextInt(6 - 1 + 1)+1;
        return n;
    }

}
