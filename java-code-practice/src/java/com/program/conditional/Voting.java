package java.com.program.conditional;

import java.util.*;

public class Voting {
	public static void main(String[] args) {
		boolean voterId = false;
		// Here Input age from user

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Age : ");
		int age = sc.nextInt();

		// Here checking condition for voting

		if (age >= 18) {
			if (voterId == true) {
				System.out.println("Eligibal for vote ");
			} else {

				System.out.println("Not Eligibale for vote");
				System.out.println("No voter ID card");
			}
		} else {
			System.out.println("Not Eligibal for vote");
		}

		sc.close();

	}

}
