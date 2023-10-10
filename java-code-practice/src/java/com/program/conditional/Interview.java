package java.com.program.conditional;

import java.util.*;

public class Interview {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter student name :");
		String name = sc.nextLine();

		System.out.print("Enter qualification code :");
		int qualificationCode = sc.nextInt();

		System.out.print("Enter Strean code :");
		int streamCode = sc.nextInt();

		System.out.print("Enter passing year :");
		int passingYear = sc.nextInt();

		System.out.print("Enter percentage :");
		double percentage = sc.nextDouble();

		// Here Student details display
		System.out.println("-----------------------");

		System.out.println("Student Name :" + name);
		System.out.println("Qualification Code : " + qualificationCode);
		System.out.println("stream code : " + streamCode);
		System.out.println("Passing Year : " + passingYear);
		System.out.println("");

		// Here checking condition based on qualification code
		// stream code ,passing year and also percentage

		// qualification code->1,3,4
		// Stream Code->1,2,5
		// Passing year->2022 to 2024

		if ((qualificationCode == 1 || qualificationCode == 3 || qualificationCode == 4)
				&& (streamCode == 1 || streamCode == 2 || streamCode == 5) && (passingYear > 2022 && passingYear < 2024)
				&& (percentage >= 55)) {
			System.out.println(name + " is eligible for interview");
		} else {
			System.out.println(name + " is not eligibal for interview");
			if (qualificationCode != 1 && qualificationCode != 3 && qualificationCode != 4) {
				System.out.println("Qualification not match");

			}
			if (streamCode != 1 && streamCode != 2 && streamCode != 5) {
				System.out.println("Stream not match");
			}
			if (passingYear > 2024 || passingYear < 2022) {
				System.out.println("Passing Year not match");
			}
		}

		sc.close();

	}

}
