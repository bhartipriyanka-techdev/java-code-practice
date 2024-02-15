package service;

import java.util.ArrayList;
import java.util.LinkedHashMap;

import entity.Customer;
import extra.Pair;

public interface RSSservice {
	LinkedHashMap<Integer, Customer> ac= new LinkedHashMap<Integer, Customer>();
	LinkedHashMap<Integer, Customer> nonac= new LinkedHashMap<Integer, Customer>();
	LinkedHashMap<Integer, Customer> delux= new LinkedHashMap<Integer, Customer>();
	LinkedHashMap<String,ArrayList<Pair<Integer, Customer>>> all= new LinkedHashMap<String, ArrayList<Pair<Integer, Customer>>>();
	ArrayList<Customer> li=new ArrayList<Customer>();
	void checkIn();
	void admin();
	void checkOut();
	boolean checkAvailability(LinkedHashMap<Integer, Customer> ac);
	Customer takeDetailsOfCustomer();
}
