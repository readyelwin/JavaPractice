package mynewproject.mynewproject.bin;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class mynewproject {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner (new File("test.txt");
		
		while(in.hasNextLine()) {
			System.out.println(in.nextLine());
		}
		
		in.close();
}
