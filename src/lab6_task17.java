/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello.world.app;

import java.util.*;

/**
 *
 * @author 1
 */
public class lab6_task17 {

    public static void main(String[] args) {
        Scanner scn_ = new Scanner(System.in);
        int amount = 0, number = 0, figure;
        do {
            figure = scn_.nextInt();
            amount = amount + figure;
            number = number + 1;
        } while (figure != 0);

        System.out.println("Сумма чисел:" + Integer.toString(amount) + ", Количество чисел:" + Integer.toString(number));

    }

}
