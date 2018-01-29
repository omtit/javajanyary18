/*

* To change this license header, choose License Headers in Project Properties.

* To change this template file, choose Tools | Templates

* and open the template in the editor.

*/

package helloworldapp;

import java.io.File;

import java.io.FileNotFoundException;

import java.io.InputStreamReader;

import java.io.PrintStream;

import java.io.UnsupportedEncodingException;

import java.util.Arrays;

import java.util.Scanner;

/**

 *

 *

 *

 * @author demachek

 *

 */

public class lab9task4954 {

    public static void main(String[] args) throws UnsupportedEncodingException {

//String encoding = System.getProperty("console.encoding","utf-8");

        Scanner scr_ = new Scanner(System.in);

//System.setProperty("console.encoding","cp866");

        int i = scr_.nextInt();

        char laters[] = scr_.next().toCharArray();

        String filename = "C:\\Users\\pro-11\\Desktop\\javajanyary18\\tasks\\files\\task4954\\test" + i + ".txt";

        File target = new File(filename);

        if (!target.exists()) {
            System.out.println("File hasn't been found!");

            System.out.println(target.getAbsolutePath());

            return;

        }

        int wordsNumber = 0;

        try {

            Scanner reader = new Scanner(target);

            while (reader.hasNext()) {

                String word = reader.nextLine();

                for (int counter = 0; counter < laters.length; counter++) {

                    if (word.indexOf(laters[counter]) != -1) {



//PrintStream ps = new PrintStream(System.out,true,"Cp866");

//System.setOut(ps);

//System.out.println(laters.toString());



//System.out.println(laters[counter]);

//ps.println(laters[counter]);

//System.out.println(counter);

                        wordsNumber = wordsNumber + 1;

                    }

                }

            }

            System.out.println(wordsNumber);

        } catch (FileNotFoundException e) {

        }

    }

}