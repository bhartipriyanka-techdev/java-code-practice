package com.java.number_program;

import java.util.Scanner;

//n ->125
//digit =3
//find like 5^3+2^2+1^1
//compare number== result number
public class CheckNumber {
    static int countDigit(int number) {
        //int digit = 0;
        int count = 0;
        while (number != 0) {
            //digit = number % 10;
            count++;
            number = number / 10;
        }
        return count;

    }

    static int findPower(int base, int exp) {
        int power = 1;
        for (int i = exp; i >= 1; i--) {
            power = power * base;
        }
        return power;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter any number :");
        int number = scanner.nextInt();
        int number1 = number;
        int digit = 0, sum = 0;
        int count = countDigit(number);
        while (number != 0) {
            digit = number % 10;
            sum = sum + findPower(digit, count);
            number = number / 10;
        }
        if (sum == number1) {
            System.out.println("It's equal no");
        } else {
            System.out.println(" It's not Equal");
        }
        scanner.close();

    }


}
