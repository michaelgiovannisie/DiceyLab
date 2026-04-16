
public class Bins {
    int s;
    int[] x = new int[s];
    int minimum;
    int maximum;
    
    public Bins(int min, int max) {
        minimum = min;
        maximum = max;
        s = max - min + 1;
        x = new int[s];
    }

    public void incrementBin(int value){
        int i = value - minimum;
        x[i]++;
    }

    public int getBin(int value){
        int i = value - minimum;
        return x[i];
    }

}
