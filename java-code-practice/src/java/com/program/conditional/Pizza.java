package java.com.program.conditional;
import java.util.*;

public class Pizza {
	public static void main(String[] args)
	{
		boolean topping1=true;
		boolean topping2=false;
		boolean cheese=true;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Pizza Type :");
		String pizzaType=sc.nextLine();
		
		System.out.print("Enter pizza price : ");
		int price=sc.nextInt();
		
		if(cheese==true) {
			price=price+80;
			
		}
		if((topping1==true)&&(cheese==true))
		{
			price=price+80+40;
		}
		if((topping1==true)&&(cheese==false))
				{
			      price=price+40;
				}
		if((topping1==true)&&(topping2==true)&&(cheese==true))
		{
			System.out.println("congrates!....you'll get coc free");
			price=price+80+40+76;
		}
		if((topping1==true)&&(topping2==true)&&(cheese==false))
		{
			price=price+40+75;
		}
		float totalPrice=price+price*0.18f;
		
		System.out.println("Pizza type : "+pizzaType);
		System.out.println("Pizza price : "+price);
		System.out.println("Total price : "+totalPrice);

		
		sc.close();
		

	}

}
