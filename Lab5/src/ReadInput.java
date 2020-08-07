import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ReadInput {

	public static void main(String[] args) throws FileNotFoundException {
		
		final char DEFAULT_SEPARATOR = ',';
		
		// read in csv file input.csv
		String input = "input.csv";
		File file = new File(System.getProperty("user.dir") + "/" + "input.csv");
		try {
		Scanner scan = new Scanner(file);
		System.out.println(file);
		scan.close();
		} 
		// print out error message if file does not exist
		catch (Exception e) {
			System.out.println(e);
		}
		
		// separate values by commas
		Scanner inputStream= new Scanner(System.in);
		while(inputStream.hasNext());
        {
            String data = inputStream.next();
            String [] values = data.split(",");
            values.sort();
        }

		inputStream.close();
		
	
	  
		
		//initialize each max variable
		int max1=0;
		int max2=1;
		int max3=3;
		
		// print out max values of each row
		System.out.println("Maximum Values");
		System.out.println("ROW 1: " + max1);
		System.out.println("ROW 2: " + max2);
		System.out.println("ROW 3: " + max3);
	}

}
