package java.com.program.operators;

import java.util.Scanner;

public class AreaOfTriangle {
	public static void main(String[] args) {
		
		//Here input base and height from user
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter base : ");
		int base =sc.nextInt();
		System.out.print("Enter height : ");
		float height = sc.nextFloat();
		
		//Here calculating area of triangle
		
		float area = 1.0f/2.0f*base*height;
		
		//Printing result
		
		System.out.println("Area of triangle="+area);
		sc.close();
	}

}
