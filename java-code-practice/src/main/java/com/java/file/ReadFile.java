package com.java.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        File file = new File("myFile.txt");
        try {

            //1st Method :- By Using Scanner
            Scanner scanner = new Scanner(System.in);
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());

            }

            //2nd Method :- By Using FileReader
            FileReader reader = new FileReader(file);
            int readch = 0;
            while((readch = reader.read())!=-1){
                System.out.println((char)readch);

            }

            //3rd Method :- By Using BufferedReader
            FileReader fread1 = new FileReader(file);
            String readch1 = null;
            BufferedReader bfread = new BufferedReader(fread1);
            while((readch1 = bfread.readLine())!=null){
                System.out.println(readch);
            }

        }
        catch (Exception exp){
            exp.printStackTrace();
        }

    }
}
