package java.com.program.conditional;

import java.util.*;

public class MarkSheet {

	public static void main(String[] args) {

		// Here Input marks of subject from user

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter markes of physics : ");
		int physics = sc.nextInt();

		System.out.print("Enter markes of chemistry : ");
		int chemistry = sc.nextInt();

		System.out.print("Enter markes of math : ");
		int math = sc.nextInt();

		System.out.print("Enter markes of computer : ");
		int computer = sc.nextInt();

		// ere checking condition
		// if score is above 34 then pass otherwise fail

		if (physics > 34 && chemistry > 34 && math > 34 && computer > 34) {
			float total = physics + chemistry + math + computer;
			float percentage = total / 400.0f * 100.0f;
			System.out.println("Pass");
			System.out.println("Marks in physics is : " + physics);
			System.out.println("Marks in chemistry is : " + chemistry);
			System.out.println("Marks in math is : " + math);
			System.out.println("Marks in computer is : " + computer);
			System.out.println("Total marks :" + total);
			System.out.println("Percentage : " + percentage);

		} else {
			System.out.println("Fail");
		}
		sc.close();

	}

}
