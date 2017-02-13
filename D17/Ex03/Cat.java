package Ex03;

import java.io.File;
import java.util.Scanner;
import java.io.FileReader;
import java.io.BufferedReader;

public class Cat {
	private String[] paths;
	private File dir;
	private BufferedReader in;
	
	public static void main(String[] args){
		Cat c = new Cat();
		c.showProg();
	}
	
	public void showProg() {
		// Read input
		System.out.println("Enter a filename: ");
		Scanner scanner = new Scanner(System.in);
		String fileName = scanner.next();
		File myFile = new File(fileName);
		if(checkDir(fileName)) {
			System.out.println("That file does not exist");
		} else {
			// change this to use try with resources line instead
			try {
				in = new BufferedReader(new FileReader(myFile));
			
			String line = in.readLine();
			while (line != null) {
				System.out.println(line);
				line = in.readLine();
			}
			} catch(Exception e) {
				e.printStackTrace();
			}
		}

	}
	
	// Returns false if file already exists
	public boolean checkDir(String fName) {
		dir = new File(".");
		paths = dir.list();
		for(String path:paths) {
			if (path.equals(fName)) {
				return false;
			}
		}
		return true;
	}
}
	