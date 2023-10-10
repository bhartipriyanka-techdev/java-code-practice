package java.com.program.operators;
import java.util.*;

public class Cube {

	public static void main(String[] args) {
		
		//Here input any number from user
		
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter any number : ");
		int number = sc.nextInt();
		
		//Here calculating cube and also printing result
		
		System.out.println("Cube of numbers = " + (number * number * number));
        sc.close();
	}

}
