package railway;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pro-27 on 26.02.2018.
 */
public class Carriage {
    Trip trip;
    String type;
    List<Seat> setSeats; 
    int number;
    
    
    public Carriage(List<Seat> seats,Trip trip,String type,int number){
        this.setSeats = new ArrayList();
        this.trip = trip;
        this.type = type;
        this.number = number;       
    }
    
    
}
