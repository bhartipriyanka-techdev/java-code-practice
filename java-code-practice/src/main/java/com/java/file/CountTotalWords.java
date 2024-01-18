package com.java.file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CountTotalWords {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("myFile.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String str = "";
        int countWords = 0;
        while((str = bufferedReader.readLine()) != null){
            String[] arr = str. split(" ");
            countWords = countWords + arr.length;
        }
        System.out.println("total words is :"+countWords);
    }
}
