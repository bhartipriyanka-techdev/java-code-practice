package com.java.patternSeries;
//* * * * *
//*       *
//*       *
//*       *
//* * * * *
public class StarSquare {
    public static void main(String[] args) {

        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows; j++) {
                if (i == 1 || i == rows || j == 1 || j == rows) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // Two spaces for interior spaces
                }
            }
            System.out.println();
        }


    }
}
