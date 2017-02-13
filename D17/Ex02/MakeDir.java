import java.io.File;
import java.util.Scanner;

public class MakeDir {

	public static void main(String[] args) {
		File dir;
		System.out.println("Enter a directory name: ");
		Scanner scanner = new Scanner(System.in);
		String userStr = scanner.next();
		dir = new File(userStr);
		System.out.println(dir.mkdir());
	}
	
	/* public boolean createDir(String s) {
		// String dirName = ".";
		dir = new File(s);
		return dir.mkdir();
	} */
}