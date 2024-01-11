package com.java.patternSeries;
//A B C D E F
//A B C D E F
//A B C D E F
//A B C D E F
//A B C D E F
public class ABCDEFRectangle {
    public static void main(String[] args) {
        int n = 5;

        for(int i = 1;i<=n ; i++) {
            char c='A';
            for(int j =1; j<=n ;j++) {

                System.out.print(c +" ");
                c++;
            }
            System.out.println();
        }
    }
}
