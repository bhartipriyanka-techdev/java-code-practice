package java.com.program.conditional;

import java.util.*;

public class Shopping {

	public static void main(String[] args) {
		double discountAmount = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st product price :");
		int product1 = sc.nextInt();

		System.out.print("Enter 2nd product price :");
		int product2 = sc.nextInt();

		System.out.print("Enter 3rd product price :");
		int product3 = sc.nextInt();

		System.out.print("Enter 4th product price :");
		int product4 = sc.nextInt();

		double total = product1 + product2 + product3 + product4;

		// Get 10% discount for all

		discountAmount = total * 0.10f;

		// Here condition for extra get discount

		if (total >= 1000 && total <= 2000) {
			discountAmount = total * 0.20f;
			System.out.println(2001 - total + "worth order must be added to get 25% discount");
			System.out.println(3001 - total + "worth order must be added to get 30% discount");
			System.out.println(4500 - total + "worth order must be added to get 50% discount");

		}
		if (total >= 2001 && total < 3000) {
			discountAmount = total * 0.25f;

			System.out.println(3001 - total + "worth order must be added to get 30% discount");
			System.out.println(4500 - total + "worth order must be added to get 50% discount");
		}
		if (total >= 3001 && total < 4500) {
			discountAmount = total * 0.30f;

			System.out.println(4500 - total + "worth order must be added to get 50% discount");
		}

		if (total >= 4500) {
			discountAmount = total * 0.50f;

		}
		double bill = total - discountAmount;
		System.out.println("Total price :" + total);
		System.out.println("Discount amount :" + discountAmount);
		System.out.println("Grand Total :" + bill);
		sc.close();

	}

}
