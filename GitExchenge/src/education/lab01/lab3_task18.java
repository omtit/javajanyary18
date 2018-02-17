/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package education.lab01;

import java.util.*;
import java.math.*;
import static javafx.beans.binding.Bindings.and;

/**
 *
 * @author 1
 */
public class lab3_task18 {

    public static void main(String[] args) {
        Scanner sc_ = new Scanner(System.in);
        try {
            int tipingnumber = sc_.nextInt();
            if (tipingnumber >= 1000 && tipingnumber <= 9999) {
                int hundredsCount = (tipingnumber % 1000) / 100;
                int unitsCount = ((tipingnumber % 1000) % 100) % 10;               
                if (hundredsCount == unitsCount) {
                    System.out.println("It is equal");
                } else {
                    System.out.println("It is unequal");
                }
            } else {
                System.out.println("Value must be into range from 1000 to 9999");
            }

        } catch (InputMismatchException e) {
            e.printStackTrace();
        }

    }

}
