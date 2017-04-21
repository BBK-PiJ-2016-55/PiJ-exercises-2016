package Ex02;

import java.io.File;
import java.util.Scanner;

public class MakeDir {
	private File dir;
	
	public static void main(String[] args) {
		MakeDir md = new MakeDir();
		md.createDir();
	}
		
	public void createDir() {
		try {
			System.out.println("Enter a directory name: ");
			Scanner scanner = new Scanner(System.in);
			String userStr = scanner.next();
			dir = new File(userStr);
			System.out.println(dir.mkdir());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}