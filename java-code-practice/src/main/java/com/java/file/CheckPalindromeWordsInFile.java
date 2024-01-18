package com.java.file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckPalindromeWordsInFile {

        static boolean isCheckPalindromeWord(String str) {
            String reverseString = "";
            for (int i = str.length() - 1; i >= 0; i--) {
                reverseString = reverseString + str.charAt(i);
            }
            return str.equals(reverseString);
        }
    public static void main(String[] args) throws IOException {
      FileReader fileReader = new FileReader("myFile.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        int countPalindromeWords = 0;

        while ((line = bufferedReader.readLine()) != null) {
            String[] words = line.split(" ");
            for (String word : words) {
                if (isCheckPalindromeWord(word)) {
                    countPalindromeWords++;
                }
            }
        }

        System.out.println("Number of palindrome words: " + countPalindromeWords);

        bufferedReader.close();


    }
}
