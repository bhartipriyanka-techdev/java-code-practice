package extra;

import java.util.ArrayList;
import java.util.LinkedHashMap;

import entity.Address;
import entity.Customer;

public class Rough {
	public static void main(String[] args) {
		LinkedHashMap<String, ArrayList<Pair<Integer,Customer>>> lm = new LinkedHashMap<String, ArrayList<Pair<Integer,Customer>>>();
		Customer c= new Customer(101,"Piya","999999",new Address(560076, "08", "zyz"),1);
		Customer c1= new Customer(102,"Raaz","9999",new Address(560076, "09", "zyz"),2);
		ArrayList<Pair<Integer,Customer>>arr= new ArrayList<Pair<Integer,Customer>>();
		arr.add(new Pair<Integer,Customer>(101,c));
		arr.add(new Pair<Integer,Customer>(102,c1));
		ArrayList<Pair<Integer,Customer>>arr1= new ArrayList<Pair<Integer,Customer>>();
		lm.put("sn",arr );
		for(String s: lm.keySet()) {
			ArrayList<Pair<Integer,Customer>> h= lm.get(s);
			for(int i=0;i<h.size();i++) {
				System.out.println(h.get(i).getRoomNo()+"   "+ h.get(i).getC());
			}
		}
	}
}
