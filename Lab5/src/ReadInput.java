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
		String row = "";
		int max = 0;
		int count = 1;

		// create loop to scan in csv values
		while (scan.hasNext()) {
			row = scan.nextLine();
			String[] data = row.split(",");

			// separate data into rows and determine max
			for (int i = 0; i < data.length; i++) {
				if (Integer.parseInt(data[i]) > max)
					max = Integer.parseInt(data[i]);
			}
			// print out max values in each row
			System.out.println("MAX " + row + ": " + max);
			count++;

		}
		// close scanner to prevent resource leaks
		scan.close();

	}
}
