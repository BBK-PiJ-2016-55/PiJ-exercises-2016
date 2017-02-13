package Ex03;

import java.io.File;
import java.util.Scanner;

public class Cat {
	private String[] paths;
	private File dir;
	private String fileName;
	
	public static void main(String[] args){
		Cat c = new Cat();
		c.showProg();
	}
	
	public void showProg() {
		// Read input
		System.out.println("Enter a filename: ");
		Scanner scanner = new Scanner(System.in);
		fileName = scanner.next();
		if(checkDir()) {
			System.out.println("That file does not exist");
		}

	}
	
	public boolean checkDir() {
		dir = new File(".");
		paths = dir.list();
		for(String path:paths) {
			if (path.equals(fileName)) {
				return false;
			}
		}
		return true;
	}
}
	