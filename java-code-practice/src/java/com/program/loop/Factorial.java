package java.com.program.loop;

import java.util.*;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter any no to find the factorial :");
		int number = sc.nextInt();
		int fact = 1;
		for (int i = 1; i <= number; i += 1) {
			fact = fact * i;
		}
		System.out.println("Factorial value of" + number + "is " + fact);
		sc.close();

	}

}
