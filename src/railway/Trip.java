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

  @Override
  public int hashCode (){

   int result =  number != null ? number.hashCode() : 0;
   result = 31* result + (from != null ? from.hashCode() : 0);
   result = 31* result + (to != null ? to.hashCode() : 0);
   result = 31* result + (date != null ? date.hashCode() : 0);
   return result;

  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Trip  = (Stop) o;

    if (number !=null ? )

            (date != null ? !date.equals(stop.date) : stop.date != null) return false;
    if (trip != null ? !trip.equals(stop.trip) : stop.trip != null) return false;
    return city != null ? city.equals(stop.city) : stop.city == null;
  }

}
