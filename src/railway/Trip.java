package railway;

import java.time.LocalDateTime;

/**
 * Created by pro-27 on 26.02.2018.
 */
//train
public class Trip {

  String number;
  City from;
  City to;
  LocalDateTime date;

  public  Trip (String number,City from,City to, LocalDateTime date){

    this.number = number;
    this.from = from;
    this.to = to;
    this.date = date;


  }


}
