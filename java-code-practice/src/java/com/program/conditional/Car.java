package java.com.program.conditional;
import java.util.*;

public class Car {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter car name :");
	String carName=sc.nextLine();
	
	System.out.println("enter car color :");
	String color=sc.nextLine();
	
	System.out.println("Enter car price :");
	int price=sc.nextInt();
	
	System.out.println("Cubic Centimeters(cc) :");
	int cc=sc.nextInt();
	
	float tax=0.0f;
	int insurance=0;
	
	if(price<800000)
	{
		tax=price*0.14f;
	}
	if(price>800000 &&price <=1500000)
	{
		tax=price*0.17f;
	}
	if(price >1500000 && price<=300000)
	{
	 tax=price*0.21f;
	
	}
	
	//Insurance slab
	
	if(cc>800 && cc<=1500)
	{
		insurance=3580*5;
	}
	if(cc>1500 && cc<=3000)
	{
		insurance=6850*5;
	}
	if(cc>3000)
	{
		insurance=8500*5;
	}
	float total=price+tax+insurance;
	
	System.out.println("------------------------------");
	System.out.println("Care Name :" +carName);
	System.out.println("Car color :"+color);
	System.out.println("Tax : "+tax);
	System.out.println("Insurance : "+insurance);
	System.out.println("Total price : "+total);
	sc.close();

	}

}
