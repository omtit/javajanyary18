package education.lab01;

import java.awt.*;
import java.io.*;
import java.util.Scanner;

public class lab10task9300 {

    public static void main(String[] args) {

        Scanner scr_ = new Scanner(System.in);
        int cx = scr_.nextInt();
        int cy = scr_.nextInt();
        int r = scr_.nextInt();
        int strWidhth = scr_.nextInt();


        lab10utils.printAsHtml("<circle cx=\""+cx+"\" cy=\""+cy+"\" r=\""+r+"\" stroke=\"green\" stroke-width=\""+strWidhth+"\" fill=\"yellow\" />\\n\" ");

    }



}
