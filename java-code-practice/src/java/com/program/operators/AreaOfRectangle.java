package java.com.program.operators;

import java.util.Scanner;

class AreaOfRectangle {

	public static void main(String[] args) {

		// Here input width and height from user

		Scanner sc = new Scanner(System.in);
		System.out.print("enter width : ");
		int width = sc.nextInt();
		System.out.print("Enter height : ");
		int height = sc.nextInt();

		// Here calculate the area of rectangle and store it into area

		int area = width * height;
		
		//Printing result
		
		System.out.println("Area of Rectangle=" + area);
        sc.close();
	}

}
