package com.java.patternSeries;
//A
//B C
//D E F
//G H I J
//K L M N O
public class ABCDPattern {
    public static void main(String[] args) {
        int n = 5;
        char c = 'A';
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(c + " ");
                c++;
            }
            System.out.println();
        }

    }
}
