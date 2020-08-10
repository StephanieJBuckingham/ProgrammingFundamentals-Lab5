public class StringReversal {

	// driver program to test implementation
	public static void main(String args[]) {
		reverseString("Hello");
	}

	// create method called reverseString
	private static String reverseString(String s) {

		{ // prints out first character if string is only one character long
			if ((s == null) || (s.length() <= 1))
				System.out.println(s);
			// reorders string if longer than 1 character
			else {
				System.out.print(s.charAt(s.length() - 1));
				reverseString(s.substring(0, s.length() - 1));
			}
		}
		// return string reversed
		return s;
	}
}