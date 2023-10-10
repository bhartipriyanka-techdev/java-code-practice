package java.com.program.conditional;
import java.util.*;

public class Day {

	public static void main(String[] args) {
		
		//Here input day from user like 1,2,3....
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter day like 1,2,3... : ");
		int day = sc.nextInt();
		
		//here checking condition and printing statement 
		
		if (day < 1 || day > 7) {
			System.out.println("Invalid input");
		}
		if (day == 1 || day == 7) {

			System.out.println("Weekend");

		}
		if (day == 2 || day == 3 || day == 4 || day == 5 || day == 6) {
			System.out.println("Weekday");

		}
		sc.close();

	}

}
