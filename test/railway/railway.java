package railway;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by pro-27 on 26.02.2018.
 */
public class railway {

    @Test
    public void test() {
        boolean cat = false;
        try {
            Controller С = new Controller();
            City msc = new City("Москва");
            //City omsk = new City("Омск");
            //City nov = new City("Новосибирск");

            С.addCity(msc);
            //С.addCity(omsk);
            С.linkCities(msc, msc);


        } catch (IllegalArgumentException e) {

            cat = true;

        }

        Assert.assertTrue(cat);

        // Assert.assertTrue(С.checkLink(msc, omsk));//проверка

//        ArrayList <City> list = new ArrayList<City>();
//        City msc = new City("msc");
//        list.add(msc);
//        Assert.assertTrue(list.contains(msc));//проверка

    }

    @Test
    public void checkCity() {

        Controller С = new Controller();
        City msc = new City("Москва");
        City omsk = new City("Омск");
        City nov = new City("Новосибирск");

        С.addCity(msc);
        С.addCity(omsk);
        С.linkCities(msc, omsk);

        Assert.assertTrue(С.checkLink(msc, omsk));//проверка
        Assert.assertTrue(С.checkLink(omsk, msc));//проверка
        Assert.assertFalse(С.checkLink(msc, nov));//проверка
        Assert.assertFalse(С.checkLink(omsk, nov));//проверка


    }

    @Test
    public void checkAddCity() {
        boolean cat = false;
        Controller C = new Controller();
        City msc = new City("Москва");
        C.addCity(msc);

        try {
            C.addCity(msc);


        } catch (IllegalArgumentException e) {
            cat = true;

        }

        Assert.assertTrue(cat);


    }


}
