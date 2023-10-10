package java.com.program.conditional;
import java.util.*;

public class Desert {

	public static void main(String[] args) {
		
		//Here deceleration of variable
		
		int price = 0;
		String flavour = null;
		boolean topping = true;
		boolean dryfruits = true;
		
		//Here input Flavor code from user 
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Flavou Code : ");
		int flavourCode=sc.nextInt();
		
		//Here checking condition of flavourCode and then assign price with flavor 
		
		if (flavourCode == 1) {
			price = 80;
			flavour = "Vanilla";
		}
		if (flavourCode == 2) {
			price = 100;
			flavour = "Chocolate";
		}
		if (flavourCode == 3) {
			price = 125;
			flavour = "Kiwi";
		}
		
		//Here checking condition for extra add topping and dryfruits 
		//If condition is true then adding price of topping and dryfruits
		
		if (topping == true) {
			price = price + 10;
		}
		if (dryfruits == true) {
			price = price + 15;
		}
		Float gstAmount = price * 0.18f;
		float totalAmount = price + gstAmount;
		System.out.println("Flavour Code : " + flavourCode);
		System.out.println("Flavour : " + flavour);
		System.out.println("Topping : "+topping);
		System.out.println("Dryfruits : "+dryfruits);
		System.out.println("price : " + price);
		System.out.println("GST Amount : " + gstAmount);
		System.out.println("Total Price : " + totalAmount);
		sc.close();
	}

}
