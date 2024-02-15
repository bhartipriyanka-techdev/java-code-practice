package serviceimpl;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Random;
import java.util.Scanner;
import entity.Address;
import entity.Customer;
import extra.Pair;
import service.RSSservice;

public class RSSserviceImpln implements RSSservice {
	Scanner sc =new Scanner(System.in);
	Random rd =new Random();
	{
		for(int i=201;i<=208;i++) {
			ac.put(i, null);
		}
		for(int i=301;i<=305;i++) {
			delux.put(i, null);
		}
		for(int i=101;i<=105;i++) {
			nonac.put(i, null);
		}
	}
	int room;
	@Override
	public void checkIn() {
		boolean flg=true;
		while(flg) {
			System.out.println("*********Room Details*********");
			System.out.println("********AC Rooms*********");
			System.out.println("1.AC\n2.TV\n3.Wifi\n4.Fridge");
			System.out.println("Price : 2500/day");
			System.out.println("********NON-AC Rooms*********");
			System.out.println("1.TV\n2.Wifi\n3.Fridge");
			System.out.println("Price : 1800/day");
			System.out.println("********Delux Rooms*********");
			System.out.println("1.Delux\n2.TV\n3.Wifi\n4.Fridge\n5.Pool\n6.Three Times Meal");
			System.out.println("Price : 4500/day");
			System.out.println("-----------------------------------------");
			System.out.println("Choose Type Of Room You Want To Checkin");
			System.out.println("Press 1 for AC\nPress 2 for Non-AC\nPress 3 for Delux");
			int op=sc.nextInt();
			switch (op) {
			case 1:
				if(checkAvailability(ac)) {
					System.out.println("Above rooms are available for you : ");
					System.out.println("Enter your room which you want to CheckIn");
					Integer roomNo=sc.nextInt();
					if(!ac.containsKey(roomNo)) {
						System.out.println("Wrong room number entered.........!!!!\t Please enter valid room number");
						break;
					}
					Customer c=takeDetailsOfCustomer();
					ac.put(roomNo, c);
					li.add(c);
//					ArrayList<Pair<Integer,Customer>> tmp= new ArrayList<Pair<Integer,Customer>>();
//					tmp.add(new Pair<Integer, Customer>(roomNo, c));
//					all.put("AC",tmp);
					if (all.containsKey("AC")) {
			            all.get("AC").add(new Pair<Integer,Customer>(roomNo, c));
			        } else {
			            ArrayList<Pair<Integer, Customer>> tmp = new ArrayList<>();
			            tmp.add(new Pair<Integer,Customer>(roomNo, c));
			            all.put("AC", tmp);
			        }
					flg=false;
				}
				break;
			case 2:
				if(checkAvailability(nonac)) {
					System.out.println("Above rooms are available for you : ");
					System.out.println("Enter your room which you want to CheckIn");
					Integer roomNo=sc.nextInt();
					if(!nonac.containsKey(roomNo)) {
						System.out.println("Wrong room number entered.........!!!!\t Please enter valid room number");
						break;
					}
					Customer c=takeDetailsOfCustomer();
					nonac.put(roomNo, c);
					li.add(c);
					if (all.containsKey("NON AC")) {
			            all.get("NON AC").add(new Pair<Integer,Customer>(roomNo, c));
			        } else {
			            ArrayList<Pair<Integer, Customer>> tmp = new ArrayList<>();
			            tmp.add(new Pair<Integer,Customer>(roomNo, c));
			            all.put("NON AC", tmp);
			        }
					flg=false;
				}
				break;
			case 3:
				if(checkAvailability(delux)) {
					System.out.println("Above rooms are available for you : ");
					System.out.println("Enter your room which you want to CheckIn");
					Integer roomNo=sc.nextInt();
					if(!delux.containsKey(roomNo)) {
						System.out.println("Wrong room number entered.........!!!!\t Please enter valid room number");
						break;
					}
					Customer c=takeDetailsOfCustomer();
					delux.put(roomNo, c);
					li.add(c);
					if (all.containsKey("DELUX")) {
			            all.get("DELUX").add(new Pair<Integer,Customer>(roomNo, c));
			        } else {
			            ArrayList<Pair<Integer, Customer>> tmp = new ArrayList<>();
			            tmp.add(new Pair<Integer,Customer>(roomNo, c));
			            all.put("DELUX", tmp);
			        }flg=false;
					
				}break;
			default:
				System.out.println("Wrong room number\n Please enter valid room number.......!!!!!!!!!");
			}
		}
	}

	@Override
	public void checkOut() {
		System.out.println("*************CHECKOUT***************");
		while(true) {
			System.out.println("Enter your Mobile Number");
			String mob=sc.next();
			int c=0,tmpRoom=0;
			double total=1.0,pay=0.0;
			String tmp="";
			for(String s: all.keySet()) {
				ArrayList<Pair<Integer,Customer>> a= all.get(s);
				for(int i=0;i<a.size();i++) {
					if(a.get(i).getC().getcPhno().equals(mob)) {
						int noOfDays=a.get(i).getC().getNoOfDaysToStay();
						if(s=="AC") {
							total=noOfDays*2500;
						}
						else if(s=="NON AC") {
							total=noOfDays*1800;
						}
						else {
							total=noOfDays*4500;
						}
						c++;
						tmp=s;
						tmpRoom=a.get(i).getRoomNo();
					}
				}
			}
			if(c==0) {
				System.out.println("Invalid Mobile Number");
			}
			else {
				while(total-pay>0) {
					System.out.println("Your total bill is "+total);
					System.out.println("Enter the amount to pay:");
					pay=sc.nextDouble();
					if(total-pay==0) {
						System.out.println("Your transaction is successfull");
					}
					else if(total-pay>0) {
						System.out.println("You still have to pay "+(total-pay));
						total-=pay;
					}
				}
				if(tmp.equals("AC")) {
					ac.put(tmpRoom, null);
				}
				else if(tmp.equals("NON AC")) {
					nonac.put(tmpRoom, null);
				}
				else if(tmp.equals("DELUX")) {
					delux.put(tmpRoom, null);
				}
				System.out.println("You can now Check Out\n THANK YOU");
				break;
			}
		}
	}

	@Override
	public boolean checkAvailability(LinkedHashMap<Integer, Customer> ac) {
		int c=0;
		for(int key: ac.keySet()) {
			if(ac.get(key)==null) {
				System.out.println(key+" ");
				c++;
			}
		}
		if(c==0) {
			System.out.println("All rooms are occupied\tRooms are not available");
		}
		return c!=0;
	}

	@Override
	public Customer takeDetailsOfCustomer() {
		System.out.println("Please enter your details:");
		System.out.println("Enter your name: ");
		sc.nextLine();
		String name=sc.nextLine();
		
		System.out.println("Enter your contact number:");
		String phno=sc.next();
		sc.nextLine();
		System.out.println("Enter your pincode:");
		int pincode=sc.nextInt();
		System.out.println("Enter your house number:");
		String houseNo=sc.nextLine();
		sc.nextLine();
		System.out.println("Enter your street name: ");
		String streetName=sc.nextLine();
		Address a=new Address(pincode, houseNo, streetName);
		System.out.println("Enter number of days you are booking: ");
		int noOfDays=sc.nextInt();
		Customer c= new Customer(rd.nextInt(500), name, phno, a, noOfDays);
		return c;
	}

	@Override
	public void admin() {
		System.out.println("****************Welcome admin****************");
		boolean flg=true;
		while(flg) {
			System.out.println("Press these buttons to view the details of Customers: ");
			System.out.println("1.All The Customers\n2.All By Categorize Way (AC,Non AC,Delux)");
			System.out.println("3.Particular type room\n4.Check the all current cusomter who are curretly booked in Hotel.\n5.Log our from Admin.");
			int op=sc.nextInt();
			switch(op){
			case 1: 
				System.out.println("CID\t\tCName\t\tCPhone\t\tCAddress\t\tNo Of Days ");
				for(Customer c: li) {
					System.out.println(c);
				}
				break;
			case 2:
				for(String s1: all.keySet()) {
					System.out.println("**************Details of "+s1+"*******************");
					System.out.println("RoomNo\t\tCID\t\tCName\t\tCPhone\t\tCAddress\t\tNo Of Days ");
					ArrayList<Pair<Integer, Customer>> a=all.get(s1);
					for(int i=0;i<a.size();i++) {
						System.out.println(a.get(i).getRoomNo()+"\t"+a.get(i).getC());
					}
				}
				break;
			case 3:
				System.out.println("Enter the type of room:");
				String s1=sc.next();
				System.out.println("**************Details of "+s1+"*******************");
				System.out.println("RoomNo\t\tCID\t\tCName\t\tCPhone\t\tCAddress\t\tNo Of Days ");
				ArrayList<Pair<Integer, Customer>> a=all.get(s1);
				for(int i=0;i<a.size();i++) {
					System.out.println(a.get(i).getRoomNo()+"\t"+a.get(i).getC());
				}
				break;
			case 4:
				System.out.println("**************Details of AC *******************");
				System.out.println("CID\t\tCName\t\tCPhone\t\tCAddress\t\tNo Of Days ");
				for(Integer d: ac.keySet()) {
					if(ac.get(d)!=null) {
						System.out.println(ac.get(d));
					}
				}
				System.out.println("**************Details of NON AC *******************");
				System.out.println("CID\t\tCName\t\tCPhone\t\tCAddress\t\tNo Of Days ");
				for(Integer d: nonac.keySet()) {
					if(nonac.get(d)!=null) {
						System.out.println(nonac.get(d));
					}
				}
				System.out.println("**************Details of AC *******************");
				System.out.println("CID\t\tCName\t\tCPhone\t\tCAddress\t\tNo Of Days ");
				for(Integer d: delux.keySet()) {
					if(delux.get(d)!=null) {
						System.out.println(delux.get(d));
					}
				}
				break;
			case 5:
				System.out.println("Logging out from admin");
				flg=false;
				break;
			default:
				System.out.println("Invalid Input");break;
			}
		}
	}
}
