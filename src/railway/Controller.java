package railway;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/**
 * Created by pro-27 on 26.02.2018.
 */
public class Controller {

    ArrayList<City> list = new ArrayList<City>();
    ArrayList<Part> listParts = new ArrayList<Part>();

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

    public Trip creatTrip (String tripNumber, City From_, City To_, String depurtureDateTime){

        String pattern = "HH:mm:ss dd.MM.yyyy";
        DateTimeFormatter f = DateTimeFormatter.ofPattern(pattern);
        LocalDateTime datDepart = LocalDateTime.parse(depurtureDateTime,f);
        LocalDateTime current = LocalDateTime.now();

        if (current.isAfter(datDepart)){

          throw new IllegalArgumentException("Дата поездки должна быть в будующем");

        }


        return   new Trip(tripNumber,From_,To_,datDepart);



    }



}
