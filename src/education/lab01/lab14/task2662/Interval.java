package education.lab01.lab14.task2662;

/**
 * Created by pro-27 on 12.03.2018.
 */
public class Interval {
    int a;
    int b;

    public Interval(int a,int b){
        this.a=a;
        this.b=b;

    }

    public boolean equals   (Object o){

        if (this==o) return  true;
        if (o==null || getClass() != o.getClass())
            return false;
        Interval interval = (Interval) o;

        if (a != interval.a) return false;
        return  b ==interval.b;


    }










}
