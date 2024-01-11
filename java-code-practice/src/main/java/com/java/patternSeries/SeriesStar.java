package com.java.patternSeries;
//*   * * *
//*   *
//* * * * *
//    *   *
//* * *   *

public class SeriesStar {
    public static void main(String[] args) {
        printPattern();
    }

    public static void printPattern() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 7; j++) {
                if ((i == 1 || i == 3 || i == 5) && (j == 1 || j == 3 || j == 6 || j == 7)) {
                    System.out.print("* ");
                } else if ((i == 2) && (j == 1 || j == 3)) {
                    System.out.print("* ");
                } else if ((i == 4) && (j == 8 || j == 7)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}


