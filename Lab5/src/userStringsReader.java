import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.PrintWriter;

public class userStringsReader {

	public static void main(String[] args) throws IOException {

		String userInput = "";
		String file = "userStrings.txt";
		Scanner scan = new Scanner(System.in);
		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter outFile = new PrintWriter(bw);

		while (!userInput.equalsIgnoreCase("done")) {
			try { // prompt to enter string
				System.out.print("Please enter your string: ");
				userInput = scan.nextLine();
				outFile.println();

				// if user input equals "done" terminate program
				if (userInput.equalsIgnoreCase("done")) {
					outFile.close();
				}
				// print file created
				outFile.print(userInput);
			}
			// handles incorrect input
			catch (NumberFormatException exception) {
				System.out.print("Please provide correct input.");
			}

		}

		// prints out terminated program and newly created file
		System.out.println("Program terminated by user.");
		System.out.println("Output file has been created: " + file);
		scan.close();
	}
}