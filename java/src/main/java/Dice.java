
import java.util.Random;


public class Dice {
    int d;

    public Dice(int n){
        d = n;
    }

    public int tossAndSum() {
        Random rand = new Random();
        int r;
        int sum = 0;
        for(int i= 0; i < d; i++){
            r = rand.nextInt(6-1+1)+1;
            sum = sum + r;
        }
        return sum;
    }

}