package java.com.program.conditional;

import java.util.*;

public class Product {

	public static void main(String[] args) {

		// Here input four product price from user

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st product price :");
		int product1 = sc.nextInt();

		System.out.print("Enter 2nd product price :");
		int product2 = sc.nextInt();

		System.out.print("Enter 3rd product price :");
		int product3 = sc.nextInt();

		System.out.print("Enter 4th product price :");
		int product4 = sc.nextInt();

		// calculating product price

		float productPrice = product1 + product2 + product3 + product4;
		System.out.println("Total product price : " + productPrice);
		if (productPrice >= 3000) {
			productPrice = productPrice - (productPrice * 0.25f);
			System.out.println("Discounted product price =" + productPrice);
		}
		sc.close();

	}

}
