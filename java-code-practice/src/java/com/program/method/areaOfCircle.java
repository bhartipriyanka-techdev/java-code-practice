
package java.com.program.method;

import java.util.*;

public class areaOfCircle {
	static void area(int radius) {
		float area = 22 / 7f * radius * radius;
		System.out.println("Area of circle : " + area);
	}

	public static void main(String[] args) {

		// Here Input the radius from the user

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter radius : ");
		int radius = sc.nextInt();

		// Here calling the method

		area(radius);
		sc.close();

	}

}
