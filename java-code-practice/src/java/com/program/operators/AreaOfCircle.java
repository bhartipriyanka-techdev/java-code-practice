package java.com.program.operators;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {

		// Here input radius from user using Scanner class 
	
		Scanner sc = new Scanner(System.in);
		System.out.print("enter radius : ");
		int radius = sc.nextInt();
		
		// and now calculate area of circle and storing it into variable like area
		
		float area = 22 / 7 * radius * radius;
		
		//Printing result
		
		System.out.println("Area of circle=" + area);
		sc.close();
	}

}
