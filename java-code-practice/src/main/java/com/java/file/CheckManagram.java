package com.java.file;
import java.util.HashSet;
import java.util.Scanner;

public class CheckManagram {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter any string :");
    String str = scanner.next();
    str = str.toLowerCase();
        HashSet set = new HashSet();
        for(int i = 0; i <= str.length()-1 ; i++){
            if(str.charAt(i) >='a' && str.charAt(i) <= 'z'){
                set.add(str.charAt(i));
            }

        }
        if(set.size() == 26){
            System.out.println("This is Anagram/PanaGram");
        }
        else{
            System.out.println("This is not Managram/Panagram");
        }

 }
}
