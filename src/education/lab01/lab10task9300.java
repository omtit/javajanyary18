package education.lab01;

import java.awt.*;
import java.io.*;
import java.util.Scanner;

public class lab10task9300 {

    public static void main(String[] args) {
      String fileName = "out/page.html";
        try {

            Scanner scr_ = new Scanner(System.in);
            int cx = scr_.nextInt();
            int cy = scr_.nextInt();
            int r = scr_.nextInt();
            int strWidhth = scr_.nextInt();

            PrintWriter writer = new PrintWriter(fileName,"UTF-8");

            writer.println("<!DOCTYPE html>\n" +
                    "<html>\n" +
                    "<head>\n" +
                    "<meta charset=\"utf-8\"/>\n" +
                    "<head/>\n" +
                    "<body>\n" +
                    "<h1>Мой первый векторный рисунок</h1>\n" +
                    "\n" +
                    "<svg width=\"800\" height=\"600\">\n" +
                    "\t<circle cx=\""+cx+"\" cy=\""+cy+"\" r=\""+r+"\" stroke=\"green\" stroke-width=\""+strWidhth+"\" fill=\"yellow\" />\n" +
                    "</svg>\n" +
                    "</body>\n" +
                    "</html>");
            writer.close();
            try {
                Desktop.getDesktop().open(new File(fileName));
            } catch (IOException e) {
                e.printStackTrace();
            }



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }




    }



}
