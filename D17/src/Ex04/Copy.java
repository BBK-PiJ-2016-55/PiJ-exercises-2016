package Ex04;

import java.io.*;
import java.util.Scanner;

public class Copy {
	private String[] paths;
	private Scanner scanner;

	public static void main(String[] args) {
		Copy c = new Copy();
		c.load();
	}

	public void load() {
		System.out.println("Enter a source filename: ");
		scanner = new Scanner(System.in);
		String srcFile = scanner.next();
		System.out.println("Enter a destination filename: ");
		String dstFile = scanner.next();
		checkFile(srcFile, dstFile);
	}

	public void checkFile(String src, String dst) {
		// create new file objects for src and dst
		File inFile = new File(src);
		File cpFile = new File(dst);
		// Check that src file exists, terminate w warning if not
		if (cpFile.exists()) {
			System.out.print("File already exists - overwrite Y/N?: ");
			Scanner sc = new Scanner(System.in);
			String str = sc.nextLine();
			if (str.equals("N")) {
				System.out.println("Operation aborted - file not copied");
			}
		} else {
			try (PrintWriter pwOut = new PrintWriter(cpFile);
				 BufferedReader in = new BufferedReader(new FileReader(inFile));) {
				String currentLine;
				// read inFile in line by line, printing it to pwOut
				while ((currentLine = in.readLine()) != null) {
					pwOut.println(currentLine);
				}
			} catch (FileNotFoundException ex) {
				System.out.println(inFile + " does not exist");
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}
}