/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello.world.app;

import java.util.*;
import java.math.*;

/**
 *
 * @author 1
 */
public class lab2_task37 {

    public static void main(String[] args) {
        Scanner sc_ = new Scanner(System.in);
        try {
            double cathetus1 = 6350;
            double height = sc_.nextInt();
            if (height < 0) {
                System.out.println("The height above surface of the Eath must be positive");
            } else {
                double hypot = 6350+height;
                double cathetus2 = Math.sqrt((hypot*hypot)-(cathetus1*cathetus1));
                System.out.printf("%.4f%n", cathetus2);
            }
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }

    }

}
