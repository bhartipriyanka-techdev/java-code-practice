package java.com.program.method;

public class Test {

	static boolean display(int age) {
		if (age >= 18) {
			return true;
		} else {
			return false;
		}

	}

	public static void main(String[] args) {

		System.out.println(display(18));
		System.out.println(display(12));
	}

}
