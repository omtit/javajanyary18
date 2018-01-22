/*

* To change this license header, choose License Headers in Project Properties.

* To change this template file, choose Tools | Templates

* and open the template in the editor.

 */
package Hello.world.app;

import java.util.Scanner;

import java.util.Arrays;

/**
 *
 *
 *
 * @author demachek
 *
 */
public class lab7_task11 {

    public static void main(String[] args) {

        //Scanner scLinesName = new Scanner(System.in);
        //Scanner scColumnesName = new Scanner(System.in); 
        //char arrayLineNames [] = scLinesName.next().toCharArray();
        //char arrayColumnNames [] = scColumnesName.next().toCharArray();
        Scanner sc_ = new Scanner(System.in);

        char arrayLineNames[] = sc_.next().toCharArray();

        char arrayColumnNames[] = sc_.next().toCharArray();

        //System.out.println(Arrays.toString(arrayColumnNames));
        String S1 = "";

        String S2 = "";

        String S3 = "";

        for (int TableLineNomber = 0; TableLineNomber < arrayLineNames.length; TableLineNomber++) {

            for (int TableColumnNomber = 0; TableColumnNomber < arrayColumnNames.length; TableColumnNomber++) {

                if (TableLineNomber == 0) {

                    S1 = S1 + " " + arrayColumnNames[TableColumnNomber];

                    S3 = S3 + "--";

                }

                if (TableColumnNomber == 0) {

                    S2 = S2 + arrayLineNames[TableLineNomber];

                }

                if (arrayLineNames[TableLineNomber] == arrayColumnNames[TableColumnNomber]) {

                    S2 = S2 + " +";

                } else {

                    S2 = S2 + "  ";

                }

                if (TableColumnNomber == arrayColumnNames.length - 1) {

                    S2 = S2 + "|" + "\n";

                }

            }

        }

        System.out.print(String.format("%" + Integer.toString(arrayColumnNames.length * 2 + 1) + "s%n", S1));

        System.out.print(S2 + String.format("%" + Integer.toString(arrayColumnNames.length * 2 + 1) + "s%n", S3));

    }

}
