package railway;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

/**
 * Created by pro-27 on 26.02.2018.
 */
public class Controller {

    ArrayList<City> list = new ArrayList<City>();
    ArrayList<Part> listParts = new ArrayList<Part>();
    HashSet<Trip> SetTrips = new HashSet();
    HashSet<Stop> SetStops = new HashSet();
    HashSet<Carriage> SetCarriage = new HashSet();
    Map<String, List<Seat>> MapSeats = new HashMap();
    Map<Ticket,List<Stop>> MapBooking = new HashMap();

    public void addCity(City c) {
        //добавить города
        if (list.contains(c)) {
            throw new IllegalArgumentException();
        }
        list.add(c);
    }

    public void linkCities(City A, City B) {
        //создать связи
        if (A == B) {
            throw new IllegalArgumentException();
        }

        if ((!list.contains(A)) || (!list.contains(B))) {
            throw new IllegalArgumentException();
        }

        Part p = new Part(A, B);
        Part p1 = new Part(B, A);
        listParts.add(p);
        listParts.add(p1);

    }

    public boolean checkLink(City A, City B) {
        //проверить что для пары городов существует связь

        for (int i = 0; i < listParts.size(); i++) {

            if (listParts.get(i).a == A && listParts.get(i).b == B) {

                return true;

            }

        }

        return false;
    }

    public Trip creatTrip(String tripNumber, City From_, City To_, String depurtureDateTime) {

        String pattern = "HH:mm:ss dd.MM.yyyy";
        DateTimeFormatter f = DateTimeFormatter.ofPattern(pattern);
        LocalDateTime datDepart = LocalDateTime.parse(depurtureDateTime, f);
        LocalDateTime current = LocalDateTime.now();
        Trip nextTrip;

        if (current.isAfter(datDepart)) {

            throw new IllegalArgumentException("Дата поездки должна быть в будующем");

        }

        nextTrip = new Trip(tripNumber, From_, To_, datDepart);

        SetTrips.add(nextTrip);

        return nextTrip;

    }

    public Stop creatStop(String arriveDate, Trip relateTrip, City arriveCity) {
        String pattern = "HH:mm:ss dd.MM.yyyy";
        DateTimeFormatter f = DateTimeFormatter.ofPattern(pattern);
        LocalDateTime datArr = LocalDateTime.parse(arriveDate, f);
        Stop nextStop;
        nextStop = new Stop(datArr, relateTrip, arriveCity);

        SetStops.add(nextStop);

        return nextStop;
    }
    
    public Carriage creatCarriage(Trip reletedTrip,String carriagtype,int carriagNumber){
     List ApropriatSeats = MapSeats.get(carriagtype);
     Carriage carr = new Carriage(ApropriatSeats,reletedTrip,carriagtype,carriagNumber);   
     SetCarriage.add(carr);
     return carr;    
    }

    public HashSet<Ticket> saleTickets(City from, City to, String date) {
        String pattern = "HH:mm:ss dd.MM.yyyy";
        DateTimeFormatter f = DateTimeFormatter.ofPattern(pattern);
        LocalDateTime requiredDate = LocalDateTime.parse(date, f);
        ComparatorStops byDate = new ComparatorStops();
        HashSet<Ticket> tickets = new HashSet();

        Map<Trip, List<Stop>> stopsByTrip = SetStops
                .stream()
                .filter(s -> s.matches(from, to, requiredDate))
                .collect((Collectors.groupingBy(s -> s.trip)));

        stopsByTrip.forEach((k, v) -> {
            if (v.size() > 1) {
                v.sort(c_);
//    v.forEach(i->{
//        
//      
//      if(i.city.equals(from)){
//          
//      cityFrom = i.city;
//      
//          
//      }else{
//       cityTo = i.city;   
//          
//      }   
//    });

List<Carriage> linkedCarr = SetCarriage.stream().filter(crr->crr.trip.equals(k)).collect(Collectors.toList());
linkedCarr.forEach(crr->{
    crr.setSeats.forEach(st->{
        
  MapBooking.entrySet().stream().filter(bk->bk.getKey().carriag.equals(crr) && bk.getKey().seat.equals(st) && (bk.getValue().stream().sorted(c_).
          filter(stp->stp.equals(v.get(0)) || stp.equals(v.get(1) || v.get(1).date.compareTo(stp.date)< ) )
  
  

if(crr.){
    
    
    
    
}
    }



);



Ticket t_ = new Ticket(k, v.get(0).city, v.get(1).city, v.get(0).date, new Seat(), new Carriage(), "Петя");
 tickets.add(t_);

            }

        });

        return tickets;

    }

}

//public class ComparatorStops implements Comparator<Stop> {
//    
//    @Override
//    public int compare(Stop s1, Stop s2) {
//        if(s1.date.compareTo(s2.date) > 0){
//            return 1;
//        } else if (s1.date.compareTo(s2.date) < 0) {
//            return -1;
//        } else {
//            return 0;
//        }
//    }
//    
//}
