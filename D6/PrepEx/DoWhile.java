/* Make a class that implements a method that reads a list of marks between 0 and 100 from the user,
one per line, and stops when the user introduces a -1. The program should output at the end (and
only at the end) how many marks there were in total, how many were distinctions (70–100), how
many were passes (50–69), how many failed (0–49), and how many were invalid (e.g. 150 or -3).
Use readLine() exactly once */

public class DoWhile {
	
	public void grader() {
		System.out.println("Enter your list of marks (-1 to finish): ");
		String str;
		int mark;
		int distMark = 0; // 70 - 100
		int passMark = 0; // 50 - 69
		int failMark = 0; // 0 - 49
		int invalidMark = 0; // all other
		do {
			str = System.console().readLine();
			mark = Integer.parseInt(str);
				if (mark >= 70 && mark <= 100) {
					distMark++;
				} else if (mark >= 50 && mark < 70) {
					passMark++;
				} else if (mark >= 0 && mark < 50) {
					failMark++;
				} else {
					invalidMark++;
				}			
		} while (mark != -1);
		
		System.out.println("Number of distinctions: " + distMark);
		System.out.println("Number of passes: " + passMark);
		System.out.println("Number of fails: " + failMark);
		System.out.println("Number of invalid marks: " + (invalidMark - 1));
		System.out.println("Total number of marks: " + (failMark + distMark + passMark + (invalidMark - 1)));
		
	}
}
	
	
	
