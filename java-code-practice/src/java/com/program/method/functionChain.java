package java.com.program.method;

import java.util.*;

public class functionChain {
	static String firstName(String fnm) {
		return "$" + fnm;
	}

	static String lastName(String lnm) {
		return "$" + lnm;
	}

	static void fullName(String fnm, String lnm) {
		String f = firstName(fnm);
		String l = lastName(lnm);
		System.out.println(f + " " + l);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter First name ");
		String fnm = sc.nextLine();

		System.out.print("Enter First name ");
		String lnm = sc.nextLine();
		fullName(fnm, lnm);
		sc.close();

	}

}
