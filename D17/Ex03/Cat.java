package Ex03;

import java.io.File;
import java.util.Scanner;
import java.io.FileReader;
import java.io.BufferedReader;

public class Cat {
	private String[] paths;
	
	public static void main(String[] args){
		Cat c = new Cat();
		System.out.println("Enter a filename: ");
		Scanner scanner = new Scanner(System.in);
		String fileName = scanner.next();
		c.showProg(fileName);
	}
	
	public void showProg(String file) {
		File myFile = new File(file);
		if (!myFile.exists()) {
			System.out.println("That file does not exist");
		} else {
			try (BufferedReader in = new BufferedReader(new FileReader(myFile))) {		
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
}
	