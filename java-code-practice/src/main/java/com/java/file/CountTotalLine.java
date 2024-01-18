package com.java.file;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CountTotalLine {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("myFile.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String str = "";
        int countLine = 0;
        while(bufferedReader.readLine() != null){
            countLine++;
        }
        System.out.println("Total Line of File is :"+countLine);


    }

}
