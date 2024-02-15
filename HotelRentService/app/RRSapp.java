package app;

import java.util.Scanner;

import entity.Address;
import entity.Customer;
import service.RSSservice;
import serviceimpl.RSSserviceImpln;;
public class RRSapp {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		RSSservice r= new RSSserviceImpln();
		System.out.println("**********Welcome to Room Rental Service");
		while(true) {
			System.out.println("*****MENU******");
			System.out.println("1.Admin Login");
			System.out.println("2.CheckIn\n3.CheckOut\n4.Exit");
			int op=sc.nextInt();
			switch(op) {
			case 1:r.admin();;break;
			case 2: r.checkIn();break;
			case 3: r.checkOut();break;
			case 4: System.out.println("Thank you visit again");
				System.exit(0);
			default:
				System.out.println("Invalid input");
			}
		}
		
	}
}
