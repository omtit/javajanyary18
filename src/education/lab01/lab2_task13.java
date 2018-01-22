/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package education.lab01;

import java.util.*;
import java.math.*;

/**
 *
 * @author 1
 */
public class lab2_task13 {

    public static void main(String[] args) {
        Scanner sc_ = new Scanner(System.in);
        try {
            double base = sc_.nextInt();
            double height = sc_.nextInt();
            if (base < 0) {
                System.out.println("The value \"base\" must be positive");
            } else if (height < 0) {
                System.out.println("The value \"height\" must be positive");
            } else {
                double area = base * height / 2;
                System.out.printf("%.2f%n", area);
            }
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }

    }

}
