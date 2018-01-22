package education.lab01;
import java.util.Scanner;

public class lab8_task11 {


        public static void main(String[] args) {

            Scanner scr_ = new Scanner(System.in);

            String str_ = scr_.nextLine();

            if (str_.startsWith("\"") == false) {

                System.out.println("String was started with \"!");

                return;

            }

            if (str_.endsWith("\"") == false) {

                System.out.println("String was started with \" and ended with \"!");

                return;

            }



            int index, start = 0;



            while (str_.endsWith("\"") | str_.endsWith(" ")  | str_.startsWith("\"") | str_.startsWith(" ")) {



                if (str_.startsWith("\"") == true) {

                    str_ = str_.substring(str_.indexOf("\"") + 1, str_.length());

                    continue;

                }

                if (str_.startsWith(" ") == true) {

                    str_ = str_.substring(str_.indexOf(" ") + 1, str_.length());

                    continue;

                }



                if (str_.endsWith("\"") == true) {

                    str_ = str_.substring(0, str_.lastIndexOf("\""));

                    continue;

                }



                if (str_.endsWith(" ") == true) {

                    str_ = str_.substring(0, str_.lastIndexOf(" "));

                }

            }

            System.out.println(str_);

        }








}
