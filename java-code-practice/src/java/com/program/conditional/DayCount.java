package java.com.program.conditional;

import java.util.*;

public class DayCount {
	public static void main(String[] args) {

		// Here input months like
		// 28 or 29 day-> 2
		// 30 days -> 4,6,9,11
		// 31 days -> 1,3,5,7,8,10,12

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter months : ");
		int months = sc.nextInt();

		// Here checking condition and print statements

		if (months == 2) {
			System.out.println("28/29 Days");
		}
		if (months == 4 || months == 6 | months == 9 || months == 11) {
			System.out.println("30 days");
		}
		if (months < 1 || months > 12) {
			System.out.println("Invalid input");
		}
		sc.close();

	}

}
