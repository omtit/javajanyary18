package education.lab01;

import java.util.Scanner;

public class lab10task3951 {

    public static void main(String[] args){

    Scanner scr_ = new Scanner(System.in);
    int x = scr_.nextInt();
    int y = scr_.nextInt();
    int wedht = scr_.nextInt();
    int height = scr_.nextInt();


        lab10utils.printAsHtml("<rect x=\""+x+"\" y=\""+y+"\" wedht=\""+wedht+"\" stroke=\"green\" height=\""+height+"\" fill=\"yellow\" />\\n\" ");

}

}
