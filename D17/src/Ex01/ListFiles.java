package Ex01;

import java.io.File;

public class ListFiles {
	public static void main(String[] args) {
		File dir;

		// Create array of files in current dir
		String dirName = ".";
		dir = new File(dirName);
		String[] paths = dir.list();

		// Loop through array and print out
		for(String path:paths) {
			System.out.println(path);
		}
	}
}