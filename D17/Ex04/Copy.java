package Ex04;

import java.io.File;
import java.util.Scanner;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.PrintWriter;

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
		// create new file objects for src and dst
		File inFile = new File(src);
		File cpFile = new File(dst);
		// Check that src file exists, terminate w warning if not
		// Can this be handled better within try/catch?
		if (!inFile.exists()) {
			System.out.println("That file does not exist");
		} else {
			// check if dst file already exists
			if (cpFile.exists()) {
			// if so, print message and provide overwrite/terminate (append?) choice
				System.out.println("That file already exists - overwrite Y/N?");
				String cont = scanner.next();
				if (cont = "Y") {
					copyfile(inFile, cpFile)
				}

			try (BufferedReader in = new BufferedReader(new FileReader(inFile))) {		
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
	