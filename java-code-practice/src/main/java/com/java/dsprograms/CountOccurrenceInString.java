package com.java.dsprograms;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class CountOccurrenceInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any String :");
        String str = scanner.next();
        LinkedHashMap<Character,Integer> map = new LinkedHashMap<Character,Integer>();
        for(int i = 0 ; i <= str.length()-1 ; i++){
            if(map.containsKey(str.charAt(i))){
                map.put(str.charAt(i), map.get(str.charAt(i)));
            }
            else{
                map.put(str.charAt(i),1);
            }
        }
        //System.out.println(map);
        for(Character key :map.keySet()){
            System.out.println(key +" "+map.get(key));
        }
    }
}
