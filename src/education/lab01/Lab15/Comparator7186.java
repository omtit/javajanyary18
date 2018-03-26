package education.lab01.Lab15;

import java.util.Comparator;

/**
 * Created by pro-27 on 26.03.2018.
 */
public class Comparator7186 implements Comparator<Integer> {
    int N;
    public  Comparator7186(int N) {
        this.N = N;

    }

    @Override
    public int compare(Integer o1, Integer o2) {
        int d1 = Math.abs(o1 - N);
        int d2 = Math.abs(o2 - N);
        if(d1 > d2){
            return 1;
        } else if (d1 == d2) {
            return 0;
        } else {
            return -1;
        }
    }



}
