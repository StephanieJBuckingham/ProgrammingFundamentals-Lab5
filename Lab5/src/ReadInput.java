import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadInput {

	public static void main(String[] args) throws FileNotFoundException {

		// read in csv file input.csv
		String file = "input.csv";
		File csv = new File("./src/input.csv");
		Scanner scan = new Scanner(csv);

		// print out title Maximum Values
		System.out.println("Maximum Values");

		// initialize variables
		int max = 0;
		int count = 1;

		// create loop to scan in csv values
		while (scan.hasNext()) {
			
			// print out max values in each row
			System.out.println("MAX " + count++ + ": " + max(scan.nextLine().split(",")));

		}
		// close scanner to prevent resource leaks
		scan.close();
		}
		
	private static String max(String[] values) {
		String max = values[0];
	      for (String value : values) {
	         if (Integer.valueOf(value) > Integer.valueOf(max)) {
	            max = value;
	         }
	      }
	      return max;
	}
	}
