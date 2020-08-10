
public class DivisorCalc {

	public static void main(String[] args) {

		// initializing variables num1 and num2
		int num1 = 200;
		int num2 = 150;

		// run method gcd on num1 & num2 and print results
		System.out.print("The greatest common divisor between " + num1 + " and " + num2 + " equals " + gcd(num1, num2));
	}

	static int gcd(int num1, int num2) {

		// Euclid's recursive algorithm
		if ((num2 <= num1) && (num1 % num2 == 0)) {
			return num2;
		} else if (num1 < num2) {
			return gcd(num2, num1);
		} else {
			return gcd(num2, num1 % num2);
		}
	}
}
