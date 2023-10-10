package java.com.program.conditional;

import java.util.Scanner;

public class AcountDeposit {
	public static void main(String[] args) {
		boolean panCard = false;

		Scanner sc = new Scanner(System.in);

		// Here input Total balance
		// Input Amount which you want to deposit

		System.out.print("Enter total balance :");
		int balance = sc.nextInt();

		System.out.print("Enter Amount : ");
		int amount = sc.nextInt();

		System.out.println("Current balance befor deposit: " + balance);

		if (amount >= 100000) {
			if (panCard == true) {
				balance = balance + amount;
				System.out.println("Current balance after deposit: " + balance);
			} else {
				System.out.println("Link the pancard");
			}
		} else {
			balance = balance + amount;
			System.out.println("Current balance after deposit: " + balance);
		}
		sc.close();
	}

}
