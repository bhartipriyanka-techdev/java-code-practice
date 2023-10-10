package java.com.program.conditional;

import java.util.*;

public class EmployeeSalary {

	public static void main(String[] args) {
		double bonus = 0;
		Scanner sc = new Scanner(System.in);

		// Here input Employee name,company name salary and also experience from user

		System.out.print("Enter Employee Name : ");
		String name = sc.nextLine();
		System.out.print("Enter company Name : ");
		String cname = sc.nextLine();
		System.out.print("Enter Employee salary :");
		double salary = sc.nextDouble();
		System.out.print("Enter employee service : ");
		double service = sc.nextDouble();

		// Here checking condition for experience(service)
		// Calculating bonus based on experience

		if (service <= 1.5) {
			bonus = salary * 0.10f;
		}
		if (service > 1.5 && service <= 2) {
			bonus = salary * 0.20f;
		}
		if (service > 2 && service <= 4) {
			bonus = salary * 0.25f;
		}
		if (service > 4 && service <= 5) {
			bonus = salary * 0.35f;
		}
		if (service >= 5) {
			bonus = salary * 0.50f;
		}

		salary = salary + bonus;
		// Here printing employee details
		System.out.println("---------Employee Details----------");
		System.out.println("Employee Name : " + name);
		System.out.println("Employee Company Name : " + cname);
		System.out.println("Employee  service : " + service);
		System.out.println("Employee salary : " + salary);

		sc.close();

	}

}
