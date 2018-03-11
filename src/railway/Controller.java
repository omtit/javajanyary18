package railway;

import java.util.ArrayList;

/**
 * Created by pro-27 on 26.02.2018.
 */
public class Controller {

    ArrayList <City> list = new ArrayList<City>();
    ArrayList <Part> listParts = new ArrayList<Part> ();

    public void addCity(City c){
        //добавить города

        list.add(c);


    }

    public void linkCities(City A, City B){
        //создать связи
        if (A==B){
           throw new IllegalArgumentException();
        }
       
        if ((! list.contains(A)) || (! list.contains(B))){        
            throw new IllegalArgumentException();        
            }

Part p = new Part(A,B);
Part p1 = new Part(B,A);
        listParts.add(p);
        listParts.add(p1);

    }

    public boolean checkLink(City A,City B){
        //проверить что для пары городов существует связь

        for (int i=0; i< listParts.size(); i++) {

            if (listParts.get(i).a==A && listParts.get(i).b==B){

                return true;


            }



        }


        return false;
    }

}
