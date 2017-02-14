package Ex04;

import java.io.File;
import java.util.Scanner;
import java.io.FileReader;
import java.io.BufferedReader;

public class Copy {
	private String[] paths;
	
	public static void main(String[] args){
		Copy c = new Copy();
		System.out.println("Enter a source filename: ");
		Scanner scanner = new Scanner(System.in);
		String srcFile = scanner.next();
		System.out.println("Enter a destination filename: ");
		String dstFile = scanner.next();
		c.checkFile(srcFile, dstFile);
	}
	
	public void checkFile(String src, String dst) {
		File inFile = new File(src);
		if (!inFile.exists()) {
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

	} */
}
	