import java.io.File;

public class ListFiles {
	public static void main(String[] args) {
		String[] paths;
		File dir;
	
		try {
			// Create array of files in current dir
			String dirName = ".";
			dir = new File(dirName);
			paths = dir.list();
			
			// Loop through array and print out
			for(String path:paths) {
				System.out.println(path);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	
	}
}