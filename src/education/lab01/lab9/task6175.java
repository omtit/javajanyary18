package education.lab01.lab9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class task6175 {

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        int i = scr.nextInt();
        String filename = "Tasks/files/task6175/test" + i + ".txt";
        File target = new File(filename);
        if (!target.exists()) {
            System.out.println("файл не найден");
            System.out.print(target.getAbsolutePath());
            return;

        }
        else {

            try {

                Scanner reader = new Scanner(target);

                while (reader.hasNext()){
                    String line = reader.nextLine();
                    System.out.println(line);
                }


            }catch (FileNotFoundException e){

            }

        }


    }


}
